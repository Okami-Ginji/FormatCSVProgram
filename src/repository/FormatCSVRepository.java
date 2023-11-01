/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.ArrayList;
import model.CSV;
import dataacess.FormatCSVDAO;

/**
 *
 * @author Administrator
 */
public class FormatCSVRepository implements IFormatCSVRepository{

    @Override
    public void importFile(ArrayList<CSV> ls) {
        FormatCSVDAO.Instance().importFile(ls);
    }

    @Override
    public void formatAddress(ArrayList<CSV> ls) {
        FormatCSVDAO.Instance().formatAddress(ls);
    }

    @Override
    public void formatName(ArrayList<CSV> ls) {
        FormatCSVDAO.Instance().formatName(ls);
    }

    @Override
    public void exportFile(ArrayList<CSV> ls) {
        FormatCSVDAO.Instance().exportFile(ls);
    }

    @Override
    public void print(ArrayList<CSV> ls) {
        FormatCSVDAO.Instance().print(ls);
    }
    
}
