package alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuTest extends BaseTests {

    @Test
    public void testContextMenu(){
        var contextMenuPage = homePage.clickContextMenuPage();
        contextMenuPage.rightClickBox();
        String content = contextMenuPage.alert_getAlertContent();
        contextMenuPage.alert_acceptAlert();
        Assert.assertEquals(content,"You selected a context menu","Incorrect context menu content.");
    }
}
