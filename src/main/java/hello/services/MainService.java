package hello.services;

import java.util.List;

import org.influxdb.dto.Point;
import org.influxdb.dto.Query;
import org.influxdb.dto.QueryResult;
import org.influxdb.dto.BoundParameterQuery.QueryBuilder;
import org.influxdb.impl.InfluxDBResultMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.influxdb.InfluxDBTemplate;
import org.springframework.stereotype.Service;

import hello.domain.Track;

@Service
public class MainService {
	
	@Autowired
	private InfluxDBTemplate<Point> influxDBTemplate;

	public List<Track> trackList() {
		Query query = QueryBuilder.newQuery("SELECT * FROM track")
		        .forDatabase("track")
		        .create();
		
		
		QueryResult queryResult = influxDBTemplate.query(query);
		
		
		return new InfluxDBResultMapper().toPOJO(queryResult, Track.class);
	}


	
	
}
