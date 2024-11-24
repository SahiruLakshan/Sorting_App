
public class SortingApp {
public static void main(String[] args){
        JFrame jframe = new JFrame();      // Create a new JFrame
        jframe.setSize(600, 650);
        jframe.setLocation(500, 100);
        jframe.setTitle("Java Sorting Application");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLayout(null);  
        jframe.setResizable(false);

        try {
            ImageIcon icon = new ImageIcon(SortingApp.class.getResource("/image.png")); //Add an app icon
            jframe.setIconImage(icon.getImage());
        } catch (Exception e) {
            System.out.println("Icon not found!");
        }


        // Title label
        JLabel titleLabel = new JLabel("JAVA SORTING APPLICATION", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setBounds(0, 20, 600, 30);
        jframe.add(titleLabel);

        // Step 1 label
        JLabel step1Label = new JLabel("1st Step - Choose CSV File", JLabel.CENTER);
        step1Label.setFont(new Font("Arial", Font.BOLD, 15));
        step1Label.setBounds(200, 80, 200, 30);
        jframe.add(step1Label);

        // Choose CSV File button
        JButton chooseFileButton = new JButton("Choose CSV File");
        chooseFileButton.setBounds(200, 120, 200, 30);
        jframe.add(chooseFileButton);

        // Label to display the selected file name
        JLabel fileNameLabel = new JLabel("No file chosen");
        fileNameLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        fileNameLabel.setBounds(400, 120, 200, 30);
        jframe.add(fileNameLabel);

        // Step 2 label
        JLabel step2Label = new JLabel("2nd Step - Select a Numeric Column", JLabel.LEFT);
        step2Label.setFont(new Font("Arial", Font.BOLD, 15));
        step2Label.setBounds(170, 160, 300, 30);
        jframe.add(step2Label);

        // Dropdown for numeric columns
        JComboBox<String> columnDropdown = new JComboBox<>();
        columnDropdown.setBounds(200, 200, 200, 30);
        jframe.add(columnDropdown);

        // Start Sorting button
        JButton startsort = new JButton("Start Sorting");
        startsort.setBounds(240, 240, 120, 30);
        jframe.add(startsort);

        JLabel labeltime = new JLabel("Execution Time", JLabel.LEFT);
        labeltime.setFont(new Font("Arial", Font.BOLD, 12));
        labeltime.setBounds(450, 280, 100, 30);
        jframe.add(labeltime);

        // Labels and buttons for sorting algorithms
        String[] algorithms = {"Insertion Sort", "Shell Sort", "Merge Sort","Heap Sort","Quick Sort"};
        JLabel[] algorithmLabels = new JLabel[algorithms.length];
        JButton[] downloadButtons = new JButton[algorithms.length];
        JLabel[] executionTimeLabels = new JLabel[algorithms.length];

        for (int i = 0; i < algorithms.length; i++) {
            algorithmLabels[i] = new JLabel(algorithms[i] + " : ", JLabel.LEFT);  //Status Table
            algorithmLabels[i].setFont(new Font("Arial", Font.BOLD, 12));
            algorithmLabels[i].setBounds(50, 320 + (i * 40), 100, 30);
            jframe.add(algorithmLabels[i]);

            downloadButtons[i] = new JButton("Download Sorted Data");
            downloadButtons[i].setFont(new Font("Arial", Font.BOLD, 10));
            downloadButtons[i].setBounds(150, 320 + (i * 40), 150, 25);
            jframe.add(downloadButtons[i]);

            executionTimeLabels[i] = new JLabel("0ms", JLabel.RIGHT);
            executionTimeLabels[i].setFont(new Font("Arial", Font.BOLD, 12));
            executionTimeLabels[i].setBounds(400, 320 + (i * 40), 100, 20);
            jframe.add(executionTimeLabels[i]);
        }

        JLabel status = new JLabel("Best Algorithm :- ", JLabel.CENTER);
        status.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
        status.setBounds(150, 540, 150, 30);
        jframe.add(status);

        JLabel bestAlgorithmLabel = new JLabel("", JLabel.CENTER);
        bestAlgorithmLabel.setFont(new Font("Arial", Font.ITALIC, 15));
        bestAlgorithmLabel.setBounds(280, 540, 180, 30);
        jframe.add(bestAlgorithmLabel);

jframe.setVisible(true);
}
}


