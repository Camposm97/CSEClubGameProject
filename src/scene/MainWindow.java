package scene;

import io.DataLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import models.bag.PlayerBag;
import scene.layout.TitleScreenPane;
import utilties.HandlerUtil;
import utilties.ImgUtil;
import utilties.TitleScreenPaneUtil;

/**
 * This is where the application starts off from.
 * @author Camposm97
 */
public class MainWindow {
	private static final int WIDTH = 16 * 70;	// 16 : 9 Ratio
	private static final int HEIGHT = 9 * 70;
	private PlayerBag playerBag;
	
	public MainWindow(Stage stage) {
		this.playerBag = DataLoader.loadPlayerBag();
		ImgUtil.loadStageIcon(stage);
		Scene scene = new Scene(new TitleScreenPane(playerBag), WIDTH, HEIGHT);
		HandlerUtil.impFullScreen(stage);
		stage.setScene(scene);
		stage.setTitle(TitleScreenPaneUtil.TITLE);
		stage.show();
	}
}
