package fi.iki.jka;

import javax.swing.*;
import java.awt.datatransfer.Transferable;
import java.io.Serializable;
import java.util.Observer;

/**
 * Created by IntelliJ IDEA.
 * User: igosyy
 * Date: 1/17/12
 * Time: 3:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class JPhotoFrameTest {
    
    @org.junit.Test
    
    public void testShowSlideShow() throws Exception
        
    {
        
        testJPhotoFrame ph = new testJPhotoFrame();
        
        //testJPhotoCollection tphoto = new testJPhotoCollection();
        
        //tphoto.value=1;


        JPhotoCollection tphoto = new JPhotoCollection("");

        //testJPhotoShow tshow = new testJPhotoShow();

        ph.slideShowActionPerformed(tphoto);//,tshow);
        
    }
          
    
    class testJPhotoCollection  extends     JPhotoCollection
    {

        public int value = 0;
        
        public int getSize(){
            
            return value;
        }
        
       
        
    }

    class testJPhotoShow extends  JPhotoShow

    {
        /*
        public testJPhotoShow()
        {
           //super(null);

        }
          */
        public void setVisible(boolean op){


        }


    }

    class testJPhotoFrame extends  JPhotoFrame

    {

        public testJPhotoFrame() throws Exception {
                // Do nothing... needed for inheritance !

        }

        public void JOptionPanelJPhoto(){


        }


    }





                

    
}

