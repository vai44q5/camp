package day09;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javafx.scene.chart.Axis;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart.Data;
import javafx.scene.chart.XYChart.Series;

public class ChartUtils {
	public static LineChart<String, Number>
	creatLineChart(String title, Map<String,
			Number>scores){
		Axis<String> xAxis=new CategoryAxis();
		Axis<Number> yAxis = new NumberAxis();
		yAxis.setLabel("����");
		xAxis.setLabel("����");
		LineChart<String,Number> lineChart=
				new LineChart<>(xAxis, yAxis);
		Series<String, Number> series=new Series<>();
		for(Entry<String,Number> entry : scores.entrySet()) {
			series.getData().add(new Data<String, Number>(entry.getKey(), entry.getValue()));
		}
		series.setName(title);
		lineChart.getData().add(series);
		return lineChart;
	}
	public static List<LineChart<String, Number>> createLineCharts(
			// String title1, Map<String, Number> scores1,
			// String title2, Map<String, Number> scores2
			Map<String, Map<String, Number>> map) {

		List<LineChart<String, Number>> charts = new ArrayList<>();

		for (Entry<String, Map<String, Number>> entry : map.entrySet()) {
			String title = entry.getKey(); // ���ĳɼ�
			Map<String, Number> scores = entry.getValue();

			// ����ĳ���γ̶�Ӧ�ı��
			LineChart<String, Number> lineChart = creatLineChart(title, scores);
			charts.add(lineChart);
		}

		return charts;
	}
}

