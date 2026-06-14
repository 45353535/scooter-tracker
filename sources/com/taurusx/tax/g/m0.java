package com.taurusx.tax.g;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: classes11.dex */
public class m0 {

    public interface c<T> {
        T z(Node node);
    }

    public class w implements c<String> {
        @Override // com.taurusx.tax.g.m0.c
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public String z(Node node) {
            return m0.z(node);
        }
    }

    public class y implements c<Node> {
        @Override // com.taurusx.tax.g.m0.c
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public Node z(Node node) {
            return node;
        }
    }

    public class z implements c<String> {
        @Override // com.taurusx.tax.g.m0.c
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public String z(Node node) {
            return m0.z(node);
        }
    }

    public static List<Node> c(Node node, String str) {
        return w(node, str, (String) null, (List<String>) null);
    }

    public static List<Node> w(Node node, String str, String str2, List<String> list) {
        if (node == null || str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        NodeList childNodes = node.getChildNodes();
        for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
            Node nodeItem = childNodes.item(i10);
            if (nodeItem.getNodeName().equals(str) && z(nodeItem, str2, list)) {
                arrayList.add(nodeItem);
            }
        }
        return arrayList;
    }

    public static Node y(Node node, String str) {
        return z(node, str, (String) null, (List<String>) null);
    }

    public static Node z(Node node, String str, String str2, List<String> list) {
        List<Node> listW;
        if (node == null || str == null || (listW = w(node, str, str2, list)) == null || listW.isEmpty()) {
            return null;
        }
        return listW.get(0);
    }

    public static List<String> y(Document document, String str, String str2, String str3) {
        return w(document, str, str2, str3, new w());
    }

    public static boolean z(Node node, String str, List<String> list) {
        Node namedItem;
        if (str == null || list == null) {
            return true;
        }
        NamedNodeMap attributes = node.getAttributes();
        return (attributes == null || (namedItem = attributes.getNamedItem(str)) == null || !list.contains(namedItem.getNodeValue())) ? false : true;
    }

    public static String z(Node node) {
        if (node == null || node.getFirstChild() == null || node.getFirstChild().getNodeValue() == null) {
            return null;
        }
        return node.getFirstChild().getNodeValue().trim();
    }

    public static Integer w(Node node, String str) {
        if (node != null && str != null) {
            try {
                return Integer.valueOf(Integer.parseInt(z(node, str)));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public static <T> List<T> w(Document document, String str, String str2, String str3, c<T> cVar) {
        NodeList elementsByTagName;
        T tZ;
        ArrayList arrayList = new ArrayList();
        if (document != null && (elementsByTagName = document.getElementsByTagName(str)) != null) {
            List listAsList = str3 == null ? null : Arrays.asList(str3);
            for (int i10 = 0; i10 < elementsByTagName.getLength(); i10++) {
                Node nodeItem = elementsByTagName.item(i10);
                if (nodeItem != null && z(nodeItem, str2, listAsList) && (tZ = cVar.z(nodeItem)) != null) {
                    arrayList.add(tZ);
                }
            }
        }
        return arrayList;
    }

    public static String z(Node node, String str) {
        Node namedItem;
        if (node == null || str == null || (namedItem = node.getAttributes().getNamedItem(str)) == null) {
            return null;
        }
        return namedItem.getNodeValue();
    }

    public static <T> T z(Document document, String str, String str2, String str3, c<T> cVar) {
        NodeList elementsByTagName;
        T tZ;
        if (document == null || (elementsByTagName = document.getElementsByTagName(str)) == null) {
            return null;
        }
        List listAsList = str3 == null ? null : Arrays.asList(str3);
        for (int i10 = 0; i10 < elementsByTagName.getLength(); i10++) {
            Node nodeItem = elementsByTagName.item(i10);
            if (nodeItem != null && z(nodeItem, str2, listAsList) && (tZ = cVar.z(nodeItem)) != null) {
                return tZ;
            }
        }
        return null;
    }

    public static List<String> w(Document document, String str) {
        return y(document, str, null, null);
    }

    public static List<Node> w(Document document, String str, String str2, String str3) {
        return w(document, str, str2, str3, new y());
    }

    public static String z(Document document, String str) {
        return z(document, str, (String) null, (String) null);
    }

    public static String z(Document document, String str, String str2, String str3) {
        return (String) z(document, str, str2, str3, new z());
    }
}
