package Helper;

import io.qameta.allure.Attachment;

public class ScreenShoteSupport {

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshot(byte[] screenShot) {
        return screenShot;
    }


}
