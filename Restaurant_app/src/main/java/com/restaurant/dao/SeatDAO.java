package com.restaurant.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.restaurant.model.Seat;
import com.restaurant.model.SeatStatus;
import com.restaurant.util.ConnectionUtil;

public class SeatDAO {

	private final JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
	SeatStatus seatStatus = new SeatStatus();

	public void save(Seat seat) {

		String sql = "insert into seat(id,Seats) values(?,?)";
		Object[] params = { seat.getSeatId(), seat.getSeatNo() };
		jdbcTemplate.update(sql, params);
		

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
