/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;
/**
 *
 * @author maikon.rosa
 */

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class Carregar_relatorio{
   public void Abrir_relatortio(List lista){
     String src ="/sistema/cadastro.jasper";
       
     InputStream relJasper = getClass().getResourceAsStream(src);
     JRBeanCollectionDataSource ds = new JRBeanCollectionDataSource(lista);
     
     Map parametros = new HashMap();
       JasperPrint impressao = null;
       try{
          impressao = JasperFillManager.fillReport(relJasper, parametros,ds);
           JasperViewer viewer = new JasperViewer(impressao, true);
           viewer.setVisible(true);
       }catch(JRException e){
            System.out.println(e.getMessage());
       }
   
   } 
}
    

