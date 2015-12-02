package src;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public class FrequencyChart extends ApplicationFrame {

    public FrequencyChart(String applicationTitle, String chartTitle, float[] value) {
        super(applicationTitle);
        //type 1 :error, type 2 : wave file type 3: coefficient
        DefaultCategoryDataset dataset
                = new DefaultCategoryDataset();

        dataset = (DefaultCategoryDataset) createDataset(value);
        JFreeChart barChart = ChartFactory.createBarChart(
                chartTitle,
                "Khoảng",
                "Số lượng",
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
        setContentPane(chartPanel);
    }

    private CategoryDataset createDataset(float[] value) {
        final DefaultCategoryDataset dataset
                = new DefaultCategoryDataset();

        String mytitle = "tần suất";

        for (int i = 0; i < value.length; i++) {
            dataset.addValue(value[i], mytitle, String.valueOf(i));
        }

        return dataset;
    }

    public static void main(String[] args) {
        float[] Value = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 2, 3, 4, 5, 6, 7, 8, 90};
        FrequencyChart chart = new FrequencyChart("dung", "nguyen van", Value);
        chart.pack();
        RefineryUtilities.centerFrameOnScreen(chart);
        chart.setVisible(true);

    }
}
