import com.sun.org.apache.xml.internal.security.utils.IgnoreAllErrorHandler;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.Serializable;
import java.util.Scanner;

import static java.lang.System.*;

public class Add extends Menu implements Serializable {

    public static void Menu() {
        String name, group, address = null;
        String arrInfo[];
        int phone;
        Scanner scanner = new Scanner(in);
        do {
            out.println("nhap ten");
            name = scanner.nextLine();
            if (!name.isEmpty()) {
                out.println("nhap nhom");
                group = scanner.nextLine();
                if (!group.isEmpty()) {
                    out.println("nhap dia chi");
                    address = scanner.nextLine();
                }
            }
        } while (true);

        }
        File file = new File("contact.txt");
    Write write = new Write(file);








    }





