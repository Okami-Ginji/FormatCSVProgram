/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.Menu;
import repository.FormatCSVRepository;
import java.util.ArrayList;
import model.CSV;
/**
 *
 * @author Administrator
 */
public class FormatCSVProgram extends Menu<String>{
    
    static String[] mc = {"Import CSV", "Format Address","Format Name","Export CSV", "Exit"};
    FormatCSVRepository program;
    ArrayList<CSV> lt;
    
    public FormatCSVProgram() {
        super("\tFormat CSV Program", mc);
        program = new FormatCSVRepository();
        lt = new ArrayList<>();
    }

    @Override
    public void execute(int n) {
        switch(n) {
            case 1:
                program.importFile(lt);
                program.print(lt);
                break;
            case 2:
                program.formatAddress(lt);
                program.print(lt);
                break;
            case 3:
                program.formatName(lt);
                program.print(lt);
                break;
            case 4:
                program.exportFile(lt);
                break;
            case 5:
                System.exit(0);
        }
    }
    
}
