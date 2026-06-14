package com.pubmatic.sdk.video.xmlserialiser;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.log.POBLog;
import java.util.ArrayList;
import java.util.List;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: classes11.dex */
public class POBNodeBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Node f63285a;

    public POBNodeBuilder(@Nullable Node node) {
        this.f63285a = node;
    }

    private NodeList a(String str) {
        try {
            return (NodeList) XPathFactory.newInstance().newXPath().compile(str).evaluate(this.f63285a, XPathConstants.NODESET);
        } catch (Exception e10) {
            POBLog.error("POBNodeBuilder", e10.getMessage(), new Object[0]);
            return null;
        }
    }

    @Nullable
    public String getAttributeValue(@NonNull String str) {
        Node node = getNode("@" + str);
        if (node != null) {
            return node.getTextContent().trim();
        }
        return null;
    }

    @Nullable
    public Node getNode(@NonNull String str) {
        try {
            return (Node) XPathFactory.newInstance().newXPath().compile(str).evaluate(this.f63285a, XPathConstants.NODE);
        } catch (Exception e10) {
            POBLog.error("POBNodeBuilder", e10.getMessage(), new Object[0]);
            return null;
        }
    }

    @Nullable
    public String getNodeName() {
        Node node = this.f63285a;
        if (node != null) {
            return node.getNodeName();
        }
        return null;
    }

    @Nullable
    public <T extends POBXMLNodeListener> T getNodeObject(@NonNull String str, @NonNull Class<T> cls) {
        Node node = getNode(str);
        if (node != null) {
            try {
                T tNewInstance = cls.newInstance();
                tNewInstance.build(new POBNodeBuilder(node));
                return tNewInstance;
            } catch (Exception e10) {
                POBLog.error("POBNodeBuilder", e10.getMessage(), new Object[0]);
            }
        }
        return null;
    }

    @Nullable
    public String getNodeValue() {
        Node node = this.f63285a;
        if (node == null || node.getTextContent().isEmpty()) {
            return null;
        }
        return this.f63285a.getTextContent().trim();
    }

    @Nullable
    public <T extends POBXMLNodeListener> List<T> getObjectList(@NonNull String str, @NonNull Class<T> cls) {
        NodeList nodeListA = a(str);
        if (nodeListA == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < nodeListA.getLength(); i10++) {
            Node nodeItem = nodeListA.item(i10);
            if (nodeItem != null) {
                try {
                    T tNewInstance = cls.newInstance();
                    tNewInstance.build(new POBNodeBuilder(nodeItem));
                    arrayList.add(tNewInstance);
                } catch (Exception e10) {
                    POBLog.error("POBNodeBuilder", e10.getMessage(), new Object[0]);
                    return null;
                }
            }
        }
        return arrayList;
    }

    @Nullable
    public List<String> getStringList(@NonNull String str) {
        NodeList nodeListA = a(str);
        if (nodeListA == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < nodeListA.getLength(); i10++) {
            Node nodeItem = nodeListA.item(i10);
            if (nodeItem != null) {
                arrayList.add(nodeItem.getTextContent().trim());
            }
        }
        return arrayList;
    }

    @Nullable
    public String getNodeValue(@NonNull String str) {
        Node node = getNode(str);
        if (node != null) {
            return node.getTextContent().trim();
        }
        return null;
    }
}
