package hello.domain;

import java.time.Instant;

import org.influxdb.annotation.Column;
import org.influxdb.annotation.Measurement;


@Measurement(name = "track")
public class Track {

	@Column(name="id")
	private String id;
	@Column(name="duration")
	private double duration;
	@Column(name = "time")
	private Instant time;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public Instant getTime() {
		return time;
	}

	public void setTime(Instant time) {
		this.time = time;
	}
}
