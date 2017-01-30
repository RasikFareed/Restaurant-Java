package com.restaurant.DAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.restaurant.Seat;
import com.restaurant.SeatStatus;
import com.restaurant.util.ConnectionUtil;
public class SeatStatusDAO {
	
	private final JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
	
	
	
	public List<SeatStatus> list() {
		String sql = "SELECT seat_status.id,Seats,state,concurrent_user_state FROM seat_status join seat group by Seats";
		return jdbcTemplate.query(sql, (rs, rowNum) -> {
			SeatStatus seatStatus = convert(rs);
			return seatStatus;
		});

	}
	
	public SeatStatus convert(final ResultSet rs) throws SQLException {
		SeatStatus seatStatus = new SeatStatus();
		Seat seat=new Seat();
		seatStatus.setStatusId(rs.getInt("id"));
		seat.setSeatNo(rs.getString("id"));
		seatStatus.setSeatNo(seat);
		seatStatus.setSeatState(rs.getString("state"));
		seatStatus.setConcurrent_user_state(rs.getBoolean("concurrent_user_state"));
		return seatStatus;
	}
	

}
