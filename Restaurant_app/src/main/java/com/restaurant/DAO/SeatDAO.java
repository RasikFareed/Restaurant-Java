package com.restaurant.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.restaurant.Seat;
import com.restaurant.SeatStatus;
import com.restaurant.util.ConnectionUtil;

public class SeatDAO {

	private final JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
	SeatStatus seatStatus = new SeatStatus();

	public void save(Seat seat) {

		String sql = "insert into seat(id,Seats) values(?,?)";
		Object[] params = { seat.getSeatId(), seat.getSeatNo() };
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("No of rows inserted: " + rows);

	}

	public List<Seat> list() {
		String sql = "SELECT id,Seats FROM seat";
		return jdbcTemplate.query(sql, (rs, rowNum) -> {
			return convert(rs);

		});

	}

	public Seat convert(final ResultSet rs) throws SQLException {
		Seat seat = new Seat();
		seat.setSeatNo(rs.getString("Seats"));
		seat.setSeatId(rs.getInt("id"));
		return seat;
	}

}
