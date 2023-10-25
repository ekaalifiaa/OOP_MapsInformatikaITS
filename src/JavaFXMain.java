import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class JavaFXMain extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Peta Kampus");

        // Membuat gambar peta kampus
        Image kampusImage = new Image("file:///C:/Users/Dell%207300/Downloads/S2/OOP/MapsInformatikaITS.png"); // Ganti dengan path ke gambar peta kampus Anda
        ImageView kampusImageView = new ImageView(kampusImage);

        // Membuat elemen-elemen gedung
        Rectangle mushola = new Rectangle(165, 144, 20, 20);
        Rectangle labPemrog = new Rectangle(609, 25, 20, 20);
        Rectangle wcCantik = new Rectangle(763, 21, 20, 20);
        Rectangle labAJ = new Rectangle(851, 265, 20, 20);
        Rectangle labIGS = new Rectangle(850, 383, 20, 20);
        Rectangle departemen = new Rectangle(848, 473, 20, 20);
        Rectangle hima = new Rectangle(846, 534, 20, 20);
        Rectangle labAlgoPemrog = new Rectangle(405, 503, 20, 20);
        Rectangle labMI = new Rectangle(348, 530, 20, 20);

        // Membuat tooltip untuk informasi gedung
        Tooltip tooltipMushola = new Tooltip("Mushola Teknik Informatika ITS.");
        Tooltip tooltiplabPemrog = new Tooltip("Laboratorium Pemrograman");
        Tooltip tooltipwcCantik = new Tooltip("WC Cantik Informatika ITS");
        Tooltip tooltiplabAJ = new Tooltip("Laboratorium Arsitektur dan Jaringan");
        Tooltip tooltiplabIGS = new Tooltip("Laboratorium Interaksi Grafika dan Seni");
        Tooltip tooltipdepartemen = new Tooltip("Departemen Teknik Informatika ITS");
        Tooltip tooltiphima = new Tooltip("Himpunan Mahasiswa Teknik Informatika");
        Tooltip tooltiplabAlgoPemrog = new Tooltip("Laboratorium Algoritma dan Pemrograman");
        Tooltip tooltiplabMI = new Tooltip("Lab MI Teknik Informatika ITS");
        
        //Set Durasi
        tooltipMushola.setShowDelay(Duration.ZERO);
        tooltiplabPemrog.setShowDelay(Duration.ZERO);
        tooltipwcCantik.setShowDelay(Duration.ZERO);
        tooltiplabAJ.setShowDelay(Duration.ZERO);
        tooltiplabIGS.setShowDelay(Duration.ZERO);
        tooltipdepartemen.setShowDelay(Duration.ZERO);
        tooltiphima.setShowDelay(Duration.ZERO);
        tooltiplabAlgoPemrog.setShowDelay(Duration.ZERO);
        tooltiplabMI.setShowDelay(Duration.ZERO);
        

        // Menambahkan tooltip ke elemen gedung
        Tooltip.install(mushola, tooltipMushola);
        Tooltip.install(labPemrog, tooltiplabPemrog);
        Tooltip.install(wcCantik, tooltipwcCantik);
        Tooltip.install(labAJ, tooltiplabAJ);
        Tooltip.install(labIGS, tooltiplabIGS);
        Tooltip.install(departemen, tooltipdepartemen);
        Tooltip.install(hima, tooltiphima);
        Tooltip.install(labAlgoPemrog, tooltiplabAlgoPemrog);
        Tooltip.install(labMI, tooltiplabMI);
        

        // Membuat root pane dan menambahkan elemen-elemen ke dalamnya
        Pane root = new Pane();
        root.getChildren().add(kampusImageView);
        root.getChildren().add(mushola);
        root.getChildren().add(labPemrog);
        root.getChildren().add(wcCantik);
        root.getChildren().add(labAJ);
        root.getChildren().add(labIGS);
        root.getChildren().add(departemen);
        root.getChildren().add(hima);
        root.getChildren().add(labAlgoPemrog);
        root.getChildren().add(labMI);
        
        
        Scene scene = new Scene(root, 900, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}