package hello.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import hello.domain.Track;
import hello.services.MainService;

@Controller
@RequestMapping(path="/api/v1/")
public class TrackController {
	
	@Autowired
	private MainService mainService;
	@GetMapping(path="/track")
	public @ResponseBody List<Track> trackList() {
		return mainService.trackList();
	}
}
