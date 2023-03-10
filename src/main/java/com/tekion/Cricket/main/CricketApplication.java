package com.tekion.Cricket.main;

import com.tekion.Cricket.beans.Match;
import com.tekion.Cricket.beans.Player;
import com.tekion.Cricket.beans.Team;
import com.tekion.Cricket.util.PlayMatch;
import com.tekion.Cricket.util.Result;
import com.tekion.Cricket.util.TeamUtil;
import com.tekion.Cricket.util.Toss;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@SpringBootApplication
@RestController
@ComponentScan({"com.tekion"})
public class CricketApplication {

	public static void main(String[] args) {

		SpringApplication.run(CricketApplication.class, args);
	}

}


