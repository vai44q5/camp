package day09;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public  class DemoLineChart extends Application {
	public void start(Stage primaryStage) throws Exception{
		VBox box=new VBox();
		Map<String,Map<String,Number>> allScores=new HashMap<>();
		Map<String,Number> scores=new HashMap<>();
		scores.put("aaa", 88);
		scores.put("bbb", 55);
		scores.put("ccc", 32);
		allScores.put("语文成绩", scores);
		
		scores = new HashMap<>();
		scores.put("aaa", 100);
		scores.put("bbb", 99);
		scores.put("ccc", 99);
		scores.put("ddd", 59);
		allScores.put("数学成绩", scores);
		
		scores = new HashMap<>();
		scores.put("aaa", 100);
		scores.put("bbb", 99);
		scores.put("ccc", 99);
		scores.put("ddd", 59);
		allScores.put("英语成绩", scores);
		
		List<LineChart<String,Number>> charts=ChartUtils.createLineCharts(allScores);
		box.getChildren().addAll(charts);
		Scene scene=new Scene(box);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
     public static void main(String[] args) {
	launch(args);
     }
}
