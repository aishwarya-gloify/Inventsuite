package com.inventsuite.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class fileupload 
{
	 //Robot framework
    public void uploadfile() throws AWTException
    {
    	
	Robot robot = new Robot();
    StringSelection stringSelection = new StringSelection("C:\\Users\\gloif\\OneDrive\\Desktop\\th.jfif");
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
    robot.delay(1000);
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);

}
    
    public void uploadfile6mb() throws AWTException
    {
    	Robot robot = new Robot();
        StringSelection stringSelection = new StringSelection("C:\\Users\\gloif\\OneDrive\\Desktop\\6mb.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
        robot.delay(1000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
    public void uploadvalidimage() throws AWTException
    {
    	Robot robot = new Robot();
        StringSelection stringSelection = new StringSelection("C:\\Users\\gloif\\Downloads\\pexels-karolina-grabowska-5650026.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
        robot.delay(1000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
}