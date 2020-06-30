package mdrahaman;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExceptionExample {

    public void deleteMongoNodeFromClusterReplSet() {
//        System.out.println("in deleteMongoNodesFromClusterReplSet");
        List list = new ArrayList();
        list.add(null);
        list.add("Hello");
        list.add("Cool");

        try {
            deleteNodeFromClusterReplSet(list);
        } catch (Exception e) {
//            System.out.println("error");
            throw new RuntimeException(e.getMessage());
        }

    }

    public void deleteNodeFromClusterReplSet(List list) {
        Iterator it = list.iterator();

        while (it.hasNext()) {

            try {
                String val = (String) it.next();
                System.out.println(val);
                throw new Exception("fdsfdjsfk");
            } catch (Exception e) {
                System.out.println("Exception occurred while deleting mongod ");
                throw new RuntimeException(e.getMessage());
            }
        }

//        list.forEach(item -> {
//            try {
//                String val = (String) item;
//                System.out.println(val);
//                throw new RuntimeException("p");
//            } catch (Exception e) {
//                System.out.println("Exception occurred while deleting mongod ");
//                throw new RuntimeException(e.getMessage());
//            }
//        });
    }
}
