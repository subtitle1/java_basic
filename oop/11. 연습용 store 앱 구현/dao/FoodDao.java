package example_11_02_transaction.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import example_11_02_transaction.vo.Category;
import example_11_02_transaction.vo.Food;
import utils.ConnectionUtil;

public class FoodDao {

	/**
	 * 지정된 식품번호에 해당하는 식품정보를 반환한다.
	 * @param foodNo 식품번호
	 * @param connection 커넥션객체
	 * @return 식품정보
	 * @throws SQLException
	 */
	public Food selectFood(int foodNo, Connection connection) throws SQLException {
		Food food = null;
		
		String sql = "select F.food_no, F.food_name, F.food_price, F.food_stock, F.food_on_sale, C.category_no, C.category_name "
				   + "from tb_sample_foods F, tb_sample_food_categories C "
				   + "where F.category_no = C.category_no "
				   + "and F.food_no = ? ";
		
		PreparedStatement pstmt = connection.prepareStatement(sql);
		pstmt.setInt(1, foodNo);
		ResultSet rs = pstmt.executeQuery();
		
		if (rs.next()) {
			food = new Food();
			food.setNo(rs.getInt("food_no"));
			food.setName(rs.getString("food_name"));
			food.setPrice(rs.getInt("food_price"));
			food.setStock(rs.getInt("food_stock"));
			food.setOnSale(rs.getString("food_on_sale"));
			
			Category category = new Category();
			category.setNo(rs.getInt("category_no"));
			category.setName(rs.getString("category_name"));
			food.setCategory(category);
		}
		
		rs.close();
		pstmt.close();
		
		return food;
	}
	
	/**
	 * 변경된 정보를 포함하고 있는 식품정보를 전달받아서 테이블에 저장한다
	 * @param food 식품정보
	 * @param connection 커넥션 객체
	 * @throws SQLException
	 */
	public void updateFood(Food food, Connection connection) throws SQLException {
		String sql = "update tb_sample_foods "
				   + "set "
				   + "	food_name = ?, "
				   + "	food_price = ?, "
				   + "	food_stock = ?, "
				   + "	food_on_sale = ?,"
				   + "	category_no = ? "
				   + "where food_no = ? ";
		
		PreparedStatement pstmt = connection.prepareStatement(sql);
		pstmt.setString(1, food.getName());
		pstmt.setInt(2, food.getPrice());
		pstmt.setInt(3, food.getStock());
		pstmt.setString(4, food.getOnSale());
		pstmt.setInt(5, food.getCategory().getNo());
		pstmt.setInt(6, food.getNo());
		
		pstmt.executeUpdate();
		
		pstmt.close();
		}
}
