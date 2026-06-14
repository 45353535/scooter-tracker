package com.mobilefuse.videoplayer.model.utils;

import javax.xml.namespace.QName;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001d\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006\u001a\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u001d\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\n\u001a\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a \u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005\u001a;\u0010\u0011\u001a\u0004\u0018\u0001H\u0012\"\u0004\b\u0000\u0010\u0012*\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u00120\u0017¢\u0006\u0002\u0010\u0018\u001a;\u0010\u0019\u001a\u0004\u0018\u0001H\u0012\"\u0004\b\u0000\u0010\u0012*\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u0002H\u00120\u0017¢\u0006\u0002\u0010\u0018\u001a&\u0010\u001b\u001a\u0004\u0018\u00010\u0015*\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH\u0002¨\u0006\u001e"}, d2 = {"getBoolNodeAttribute", "", "attributeName", "", "node", "Lorg/w3c/dom/Node;", "(Ljava/lang/String;Lorg/w3c/dom/Node;)Ljava/lang/Boolean;", "getElementValue", "getIntNodeAttribute", "", "(Ljava/lang/String;Lorg/w3c/dom/Node;)Ljava/lang/Integer;", "getStringNodeAttribute", "getStringNodeValue", "nodeName", "xpath", "Ljavax/xml/xpath/XPath;", "rootNode", "evaluateNodeOrNull", "T", "expression", "item", "", "callback", "Lkotlin/Function1;", "(Ljavax/xml/xpath/XPath;Ljava/lang/String;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "evaluateNodesOrNull", "Lorg/w3c/dom/NodeList;", "evaluateOrNull", "returnType", "Ljavax/xml/namespace/QName;", "mobilefuse-video-player_release"}, k = 2, mv = {1, 4, 3})
public final class XmlParsingExtensionsKt {
    @Nullable
    public static final <T> T evaluateNodeOrNull(@NotNull XPath evaluateNodeOrNull, @NotNull String expression, @NotNull Object item, @NotNull Function1<? super Node, ? extends T> callback) {
        Intrinsics.checkNotNullParameter(evaluateNodeOrNull, "$this$evaluateNodeOrNull");
        Intrinsics.checkNotNullParameter(expression, "expression");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(callback, "callback");
        QName qName = XPathConstants.NODE;
        Intrinsics.checkNotNullExpressionValue(qName, "XPathConstants.NODE");
        Node node = (Node) evaluateOrNull(evaluateNodeOrNull, expression, item, qName);
        if (node == null) {
            return null;
        }
        return callback.invoke(node);
    }

    @Nullable
    public static final <T> T evaluateNodesOrNull(@NotNull XPath evaluateNodesOrNull, @NotNull String expression, @NotNull Object item, @NotNull Function1<? super NodeList, ? extends T> callback) {
        Intrinsics.checkNotNullParameter(evaluateNodesOrNull, "$this$evaluateNodesOrNull");
        Intrinsics.checkNotNullParameter(expression, "expression");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(callback, "callback");
        QName qName = XPathConstants.NODESET;
        Intrinsics.checkNotNullExpressionValue(qName, "XPathConstants.NODESET");
        NodeList nodeList = (NodeList) evaluateOrNull(evaluateNodesOrNull, expression, item, qName);
        if (nodeList == null) {
            return null;
        }
        return callback.invoke(nodeList);
    }

    private static final Object evaluateOrNull(XPath xPath, String str, Object obj, QName qName) {
        try {
            return xPath.evaluate(str, obj, qName);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @Nullable
    public static final Boolean getBoolNodeAttribute(@NotNull String attributeName, @NotNull Node node) {
        Intrinsics.checkNotNullParameter(attributeName, "attributeName");
        Intrinsics.checkNotNullParameter(node, "node");
        String stringNodeAttribute = getStringNodeAttribute(attributeName, node);
        if (stringNodeAttribute != null) {
            return Boolean.valueOf(Boolean.parseBoolean(stringNodeAttribute));
        }
        return null;
    }

    @Nullable
    public static final String getElementValue(@NotNull Node node) {
        Intrinsics.checkNotNullParameter(node, "node");
        String textContent = node.getTextContent();
        if (textContent != null) {
            return StringsKt.v1(textContent).toString();
        }
        return null;
    }

    @Nullable
    public static final Integer getIntNodeAttribute(@NotNull String attributeName, @NotNull Node node) {
        Intrinsics.checkNotNullParameter(attributeName, "attributeName");
        Intrinsics.checkNotNullParameter(node, "node");
        String stringNodeAttribute = getStringNodeAttribute(attributeName, node);
        if (stringNodeAttribute != null) {
            return StringsKt.toIntOrNull(stringNodeAttribute);
        }
        return null;
    }

    @Nullable
    public static final String getStringNodeAttribute(@NotNull String attributeName, @NotNull Node node) {
        Node namedItem;
        Intrinsics.checkNotNullParameter(attributeName, "attributeName");
        Intrinsics.checkNotNullParameter(node, "node");
        NamedNodeMap attributes = node.getAttributes();
        if (attributes == null || (namedItem = attributes.getNamedItem(attributeName)) == null) {
            return null;
        }
        return namedItem.getNodeValue();
    }

    @Nullable
    public static final String getStringNodeValue(@NotNull String nodeName, @NotNull XPath xpath, @NotNull Node rootNode) {
        Intrinsics.checkNotNullParameter(nodeName, "nodeName");
        Intrinsics.checkNotNullParameter(xpath, "xpath");
        Intrinsics.checkNotNullParameter(rootNode, "rootNode");
        try {
            QName qName = XPathConstants.NODE;
            Intrinsics.checkNotNullExpressionValue(qName, "XPathConstants.NODE");
            Node node = (Node) evaluateOrNull(xpath, nodeName, rootNode, qName);
            if (node == null) {
                return null;
            }
            return getElementValue(node);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
