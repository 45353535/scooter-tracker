package com.mobilefuse.videoplayer.model;

import android.content.Context;
import com.ironsource.sdk.controller.f;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.logging.HttpRequestTracker;
import com.mobilefuse.sdk.network.client.HttpClientKt;
import com.mobilefuse.sdk.network.client.HttpError;
import com.mobilefuse.sdk.network.client.HttpGetRequest;
import com.mobilefuse.sdk.network.client.HttpResponse;
import com.mobilefuse.videoplayer.model.VastTime;
import com.mobilefuse.videoplayer.model.utils.XmlParsingExtensionsKt;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.a;
import com.taurusx.tax.f.c;
import com.taurusx.tax.f.n;
import com.taurusx.tax.f.s;
import com.taurusx.tax.f.w;
import com.taurusx.tax.f.y;
import com.taurusx.tax.f.z;
import com.taurusx.tax.vast.VastIconXmlManager;
import com.taurusx.tax.vast.VastResourceXmlManager;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.t0;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¤\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a.\u0010\u0007\u001a\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002\u001a\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002\u001a:\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013j\u0002`\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u001c\u001a\u001c\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001e0\u00132\u0006\u0010\u001f\u001a\u00020\u001aH\u0002\u001a\u001c\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001a0\u00132\u0006\u0010!\u001a\u00020\u001aH\u0002\u001a\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002\u001a\u001a\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002\u001a&\u0010'\u001a\u00020(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002\u001a\u001e\u0010,\u001a\b\u0012\u0004\u0012\u00020-0#2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002\u001a\u001e\u0010.\u001a\b\u0012\u0004\u0012\u00020/0#2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002\u001a\u001e\u00100\u001a\b\u0012\u0004\u0012\u0002010#2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002\u001a\u001e\u00102\u001a\b\u0012\u0004\u0012\u0002030#2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002\u001a\u001a\u00104\u001a\u0004\u0018\u0001052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002\u001a@\u00106\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013j\u0002`\u0016*\u0002072\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u001cH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006*\"\u00108\"\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¨\u00069"}, d2 = {"VAST_MAX_REDIRECTS_COUNT", "", "vastClickThroughOrNull", "Lcom/mobilefuse/videoplayer/model/VastClickThrough;", "Lorg/w3c/dom/Node;", "getVastClickThroughOrNull", "(Lorg/w3c/dom/Node;)Lcom/mobilefuse/videoplayer/model/VastClickThrough;", "addVastEvents", "events", "", "Lcom/mobilefuse/videoplayer/model/VastEvent;", "eventType", "Lcom/mobilefuse/videoplayer/model/EventType;", "xpath", "Ljavax/xml/xpath/XPath;", "rootNode", "createVastAdFromXml", "Lcom/mobilefuse/videoplayer/model/VastAd;", "createVastModelFromXml", "Lcom/mobilefuse/sdk/exception/Either;", "Lcom/mobilefuse/videoplayer/model/VastError;", "Lcom/mobilefuse/videoplayer/model/VastModel;", "Lcom/mobilefuse/videoplayer/model/VastLoadResult;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "adm", "", "macroProcessorFn", "Lkotlin/Function1;", "createVastTagFromXml", "Lcom/mobilefuse/videoplayer/model/VastTag;", "xml", "loadWrapperVast", "url", "parseAdCompanions", "", "Lcom/mobilefuse/videoplayer/model/VastCompanion;", "parseAdLinear", "Lcom/mobilefuse/videoplayer/model/VastLinear;", "parseAdVerifications", "", "list", "", "Lcom/mobilefuse/videoplayer/model/VastVerification;", "parseCreatives", "Lcom/mobilefuse/videoplayer/model/VastCreative;", "parseIcons", "Lcom/mobilefuse/videoplayer/model/VastIcon;", "parseMediaFiles", "Lcom/mobilefuse/videoplayer/model/VastMediaFile;", "parseUniversalAdIdList", "Lcom/mobilefuse/videoplayer/model/VastUniversalAdId;", "parseVastResource", "Lcom/mobilefuse/videoplayer/model/VastBaseResource;", "parseVastXml", "Lcom/mobilefuse/videoplayer/model/VastXmlParser;", "VastLoadResult", "mobilefuse-video-player_release"}, k = 2, mv = {1, 4, 3})
public final class VastDataModelFromXmlKt {
    public static final int VAST_MAX_REDIRECTS_COUNT = 10;

    /* JADX INFO: renamed from: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt$parseAdLinear$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/mobilefuse/videoplayer/model/VastLinear;", "itLinearNode", "Lorg/w3c/dom/Node;", "invoke"}, k = 3, mv = {1, 4, 3})
    static final class C47161 extends Lambda implements Function1<Node, VastLinear> {
        final /* synthetic */ XPath $xpath;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C47161(XPath xPath) {
            super(1);
            this.$xpath = xPath;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final VastLinear invoke(@NotNull Node itLinearNode) {
            Intrinsics.checkNotNullParameter(itLinearNode, "itLinearNode");
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            XmlParsingExtensionsKt.evaluateNodeOrNull(this.$xpath, s.f66032y, itLinearNode, new Function1<Node, Integer>() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt.parseAdLinear.1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Node node) {
                    return Integer.valueOf(invoke2(node));
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final int invoke2(@NotNull Node it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    VastDataModelFromXmlKt.addVastEvents(linkedHashSet, EventType.ClickTracking, C47161.this.$xpath, it);
                    return VastDataModelFromXmlKt.addVastEvents(linkedHashSet, EventType.CustomClick, C47161.this.$xpath, it);
                }
            });
            XmlParsingExtensionsKt.evaluateNodeOrNull(this.$xpath, "TrackingEvents", itLinearNode, new Function1<Node, Integer>() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt.parseAdLinear.1.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Integer invoke(Node node) {
                    return Integer.valueOf(invoke2(node));
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final int invoke2(@NotNull Node it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return VastDataModelFromXmlKt.addVastEvents(linkedHashSet, EventType.Tracking, C47161.this.$xpath, it);
                }
            });
            List listEmptyList = (List) XmlParsingExtensionsKt.evaluateNodeOrNull(this.$xpath, s.f66008a, itLinearNode, new Function1<Node, List<? extends VastMediaFile>>() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt$parseAdLinear$1$mediaFiles$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final List<VastMediaFile> invoke(@NotNull Node it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return VastDataModelFromXmlKt.parseMediaFiles(this.this$0.$xpath, it);
                }
            });
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            List list = listEmptyList;
            List<VastMediaFile> listVerifyMediaFiles = VastDataModelExtensionsKt.verifyMediaFiles(list);
            XmlParsingExtensionsKt.evaluateNodeOrNull(this.$xpath, s.f66027t, itLinearNode, new Function1<Node, List<? extends VastIcon>>() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt.parseAdLinear.1.3
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final List<VastIcon> invoke(@NotNull Node it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return VastDataModelFromXmlKt.parseIcons(C47161.this.$xpath, it);
                }
            });
            VastClickThrough vastClickThrough = (VastClickThrough) XmlParsingExtensionsKt.evaluateNodeOrNull(this.$xpath, "VideoClicks/ClickThrough", itLinearNode, new Function1<Node, VastClickThrough>() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt$parseAdLinear$1$clickThrough$1
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final VastClickThrough invoke(@NotNull Node it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return VastDataModelFromXmlKt.getVastClickThroughOrNull(it);
                }
            });
            VastTime.Companion companion = VastTime.INSTANCE;
            return new VastLinear(companion.create(XmlParsingExtensionsKt.getStringNodeAttribute(s.f66023p, itLinearNode)), companion.create(XmlParsingExtensionsKt.getStringNodeValue("Duration", this.$xpath, itLinearNode)), vastClickThrough, linkedHashSet, list, listVerifyMediaFiles, VastDataModelFromXmlKt.parseIcons(this.$xpath, itLinearNode));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int addVastEvents(final Set<VastEvent> set, final EventType eventType, XPath xPath, Node node) {
        try {
            final t0 t0Var = new t0();
            t0Var.f93331b = 0;
            XmlParsingExtensionsKt.evaluateNodesOrNull(xPath, eventType.toString(), node, new Function1<NodeList, Unit>() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt.addVastEvents.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(NodeList nodeList) {
                    invoke2(nodeList);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull NodeList itNodes) {
                    Intrinsics.checkNotNullParameter(itNodes, "itNodes");
                    int length = itNodes.getLength();
                    for (int i10 = 0; i10 < length; i10++) {
                        Node node2 = itNodes.item(i10);
                        EventType eventType2 = eventType;
                        Intrinsics.checkNotNullExpressionValue(node2, "node");
                        set.add(new VastEvent(eventType2, XmlParsingExtensionsKt.getStringNodeAttribute("event", node2), XmlParsingExtensionsKt.getStringNodeAttribute("id", node2), VastTime.INSTANCE.create(XmlParsingExtensionsKt.getStringNodeAttribute("offset", node2)), XmlParsingExtensionsKt.getElementValue(node2)));
                        t0Var.f93331b++;
                    }
                }
            });
            return t0Var.f93331b;
        } catch (Throwable th2) {
            StabilityHelper.logException("addVastEvents", th2);
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VastAd createVastAdFromXml(final XPath xPath, Node node) {
        Node node2 = (Node) XmlParsingExtensionsKt.evaluateNodeOrNull(xPath, w.f66049y, node, new Function1<Node, Node>() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt$createVastAdFromXml$wrapperNode$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Node invoke(@NotNull Node it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it;
            }
        });
        Node node3 = (Node) XmlParsingExtensionsKt.evaluateNodeOrNull(xPath, w.f66048w, node, new Function1<Node, Node>() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt$createVastAdFromXml$inlineNode$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Node invoke(@NotNull Node it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it;
            }
        });
        if (node2 != null) {
            node3 = node2;
        }
        if (node3 == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        addVastEvents(linkedHashSet, EventType.Impression, xPath, node3);
        addVastEvents(linkedHashSet, EventType.Error, xPath, node3);
        List listEmptyList = (List) XmlParsingExtensionsKt.evaluateNodeOrNull(xPath, y.f66054o, node3, new Function1<Node, List<? extends VastCreative>>() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt$createVastAdFromXml$creativesList$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final List<VastCreative> invoke(@NotNull Node it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return VastDataModelFromXmlKt.parseCreatives(xPath, it);
            }
        });
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        final ArrayList arrayList = new ArrayList();
        XmlParsingExtensionsKt.evaluateNodesOrNull(xPath, "AdVerifications|Extensions/Extension[@type='AdVerifications']/AdVerifications", node3, new Function1<NodeList, Unit>() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt.createVastAdFromXml.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(NodeList nodeList) {
                invoke2(nodeList);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull NodeList it) {
                Intrinsics.checkNotNullParameter(it, "it");
                int length = it.getLength();
                for (int i10 = 0; i10 < length; i10++) {
                    List list = arrayList;
                    XPath xPath2 = xPath;
                    Node nodeItem = it.item(i10);
                    Intrinsics.checkNotNullExpressionValue(nodeItem, "it.item(i)");
                    VastDataModelFromXmlKt.parseAdVerifications(list, xPath2, nodeItem);
                }
            }
        });
        VastAdContent vastInline = new VastInline(XmlParsingExtensionsKt.getStringNodeValue("AdSystem", xPath, node3), XmlParsingExtensionsKt.getStringNodeValue("AdTitle", xPath, node3), XmlParsingExtensionsKt.getStringNodeValue("AdServingId", xPath, node3), XmlParsingExtensionsKt.getStringNodeValue("Description", xPath, node3), XmlParsingExtensionsKt.getStringNodeValue("Advertiser", xPath, node3), linkedHashSet, listEmptyList, arrayList);
        if (node2 != null) {
            vastInline = new VastWrapper(vastInline, XmlParsingExtensionsKt.getBoolNodeAttribute("followAdditionalWrappers", node3), XmlParsingExtensionsKt.getBoolNodeAttribute("allowMultipleAds", node3), XmlParsingExtensionsKt.getBoolNodeAttribute("fallbackOnNoAd", node3), (String) XmlParsingExtensionsKt.evaluateNodeOrNull(xPath, n.f66007g, node3, new Function1<Node, String>() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt$createVastAdFromXml$vastWrapper$1
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final String invoke(@NotNull Node it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return XmlParsingExtensionsKt.getElementValue(it);
                }
            }));
        }
        String stringNodeAttribute = XmlParsingExtensionsKt.getStringNodeAttribute("id", node);
        Integer intNodeAttribute = XmlParsingExtensionsKt.getIntNodeAttribute(w.f66047c, node);
        String stringNodeAttribute2 = XmlParsingExtensionsKt.getStringNodeAttribute("adType", node);
        if (stringNodeAttribute2 == null) {
            stringNodeAttribute2 = "video";
        }
        return new VastAd(stringNodeAttribute, intNodeAttribute, stringNodeAttribute2, vastInline);
    }

    @NotNull
    public static final Either<VastError, VastModel> createVastModelFromXml(@NotNull Context context, @NotNull String adm, @NotNull Function1<? super String, String> macroProcessorFn) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(macroProcessorFn, "macroProcessorFn");
        return parseVastXml(new VastXmlParser(), context, adm, macroProcessorFn);
    }

    private static final Either<VastError, VastTag> createVastTagFromXml(String str) {
        try {
            Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(str)));
            Intrinsics.checkNotNullExpressionValue(document, "factory.newDocumentBuild…ource(StringReader(xml)))");
            final XPath xpath = XPathFactory.newInstance().newXPath();
            try {
                final LinkedHashSet linkedHashSet = new LinkedHashSet();
                Intrinsics.checkNotNullExpressionValue(xpath, "xpath");
                Node node = (Node) XmlParsingExtensionsKt.evaluateNodeOrNull(xpath, "/VAST", document, new Function1<Node, Node>() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt$createVastTagFromXml$rootNode$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final Node invoke(@NotNull Node it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        Set set = linkedHashSet;
                        EventType eventType = EventType.Error;
                        XPath xpath2 = xpath;
                        Intrinsics.checkNotNullExpressionValue(xpath2, "xpath");
                        VastDataModelFromXmlKt.addVastEvents(set, eventType, xpath2, it);
                        return it;
                    }
                });
                if (node == null) {
                    return new ErrorResult(VastError.XML_PARSING_FAILED);
                }
                String stringNodeAttribute = XmlParsingExtensionsKt.getStringNodeAttribute("version", node);
                final ArrayList arrayList = new ArrayList();
                return ((Unit) XmlParsingExtensionsKt.evaluateNodesOrNull(xpath, "/VAST/Ad", document, new Function1<NodeList, Unit>() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt.createVastTagFromXml.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(NodeList nodeList) {
                        invoke2(nodeList);
                        return Unit.f93236a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull NodeList itNodes) {
                        Intrinsics.checkNotNullParameter(itNodes, "itNodes");
                        int length = itNodes.getLength();
                        for (int i10 = 0; i10 < length; i10++) {
                            Node nodeItem = itNodes.item(i10);
                            if (nodeItem != null) {
                                XPath xpath2 = xpath;
                                Intrinsics.checkNotNullExpressionValue(xpath2, "xpath");
                                VastAd vastAdCreateVastAdFromXml = VastDataModelFromXmlKt.createVastAdFromXml(xpath2, nodeItem);
                                if (vastAdCreateVastAdFromXml != null) {
                                    arrayList.add(vastAdCreateVastAdFromXml);
                                }
                            }
                        }
                    }
                })) == null ? new ErrorResult(VastError.XML_PARSING_FAILED) : new SuccessResult(new VastTag(stringNodeAttribute, linkedHashSet, arrayList));
            } catch (Throwable th2) {
                StabilityHelper.logException("createVastTagFromXml", th2);
                return new ErrorResult(VastError.XML_PARSING_FAILED);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            return new ErrorResult(VastError.XML_PARSING_FAILED);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VastClickThrough getVastClickThroughOrNull(Node node) {
        String elementValue = XmlParsingExtensionsKt.getElementValue(node);
        if (elementValue == null) {
            return null;
        }
        return new VastClickThrough(XmlParsingExtensionsKt.getStringNodeAttribute("id", node), elementValue);
    }

    private static final Either<VastError, String> loadWrapperVast(String str) {
        Either<HttpError, HttpResponse> sync = HttpClientKt.getDefaultHttpClient().getSync(new HttpGetRequest(str, MapsKt.emptyMap(), false, false, 10000L, 8, null));
        if (sync instanceof SuccessResult) {
            return new SuccessResult(((HttpResponse) ((SuccessResult) sync).getValue()).getBody());
        }
        if (sync instanceof ErrorResult) {
            return new ErrorResult(VastError.URI_UNAVAILABLE_OR_TIMEOUT);
        }
        throw new m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<VastCompanion> parseAdCompanions(final XPath xPath, Node node) {
        List<VastCompanion> list = (List) XmlParsingExtensionsKt.evaluateNodesOrNull(xPath, "CompanionAds/Companion", node, new Function1<NodeList, List<VastCompanion>>() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt.parseAdCompanions.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final List<VastCompanion> invoke(@NotNull NodeList nodeList) {
                NodeList itNodes = nodeList;
                Intrinsics.checkNotNullParameter(itNodes, "itNodes");
                ArrayList arrayList = new ArrayList();
                int length = itNodes.getLength();
                int i10 = 0;
                while (i10 < length) {
                    Node node2 = itNodes.item(i10);
                    final LinkedHashSet linkedHashSet = new LinkedHashSet();
                    EventType eventType = EventType.CompanionClickTracking;
                    XPath xPath2 = xPath;
                    Intrinsics.checkNotNullExpressionValue(node2, "node");
                    VastDataModelFromXmlKt.addVastEvents(linkedHashSet, eventType, xPath2, node2);
                    XmlParsingExtensionsKt.evaluateNodeOrNull(xPath, "TrackingEvents", node2, new Function1<Node, Integer>() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt.parseAdCompanions.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Integer invoke(Node node3) {
                            return Integer.valueOf(invoke2(node3));
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final int invoke2(@NotNull Node it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return VastDataModelFromXmlKt.addVastEvents(linkedHashSet, EventType.Tracking, xPath, it);
                        }
                    });
                    int i11 = length;
                    VastCompanion vastCompanion = new VastCompanion(XmlParsingExtensionsKt.getStringNodeAttribute("id", node2), XmlParsingExtensionsKt.getIntNodeAttribute("width", node2), XmlParsingExtensionsKt.getIntNodeAttribute("height", node2), XmlParsingExtensionsKt.getIntNodeAttribute("assetWidth", node2), XmlParsingExtensionsKt.getIntNodeAttribute("assetHeight", node2), XmlParsingExtensionsKt.getIntNodeAttribute("expandedWidth", node2), XmlParsingExtensionsKt.getIntNodeAttribute("expandedHeight", node2), XmlParsingExtensionsKt.getStringNodeAttribute("apiFramework", node2), XmlParsingExtensionsKt.getStringNodeAttribute("adSlotId", node2), XmlParsingExtensionsKt.getIntNodeAttribute("pxratio", node2), XmlParsingExtensionsKt.getStringNodeAttribute("renderingMode", node2), XmlParsingExtensionsKt.getStringNodeValue("AltText", xPath, node2), (VastClickThrough) XmlParsingExtensionsKt.evaluateNodeOrNull(xPath, c.f66001o, node2, new Function1<Node, VastClickThrough>() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt$parseAdCompanions$1$clickThrough$1
                        @Override // kotlin.jvm.functions.Function1
                        @Nullable
                        public final VastClickThrough invoke(@NotNull Node it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return VastDataModelFromXmlKt.getVastClickThroughOrNull(it);
                        }
                    }), linkedHashSet, VastDataModelFromXmlKt.parseVastResource(xPath, node2));
                    if (VastDataModelExtensionsKt.isValid(vastCompanion)) {
                        arrayList.add(vastCompanion);
                    }
                    i10++;
                    itNodes = nodeList;
                    length = i11;
                }
                return arrayList;
            }
        });
        return list == null ? CollectionsKt.emptyList() : list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VastLinear parseAdLinear(XPath xPath, Node node) {
        return (VastLinear) XmlParsingExtensionsKt.evaluateNodeOrNull(xPath, y.f66052c, node, new C47161(xPath));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void parseAdVerifications(final List<VastVerification> list, final XPath xPath, Node node) {
        XmlParsingExtensionsKt.evaluateNodesOrNull(xPath, z.f66070y, node, new Function1<NodeList, Unit>() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt.parseAdVerifications.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(NodeList nodeList) {
                invoke2(nodeList);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull NodeList itNodes) {
                Intrinsics.checkNotNullParameter(itNodes, "itNodes");
                int length = itNodes.getLength();
                for (int i10 = 0; i10 < length; i10++) {
                    Node node2 = itNodes.item(i10);
                    final LinkedHashSet linkedHashSet = new LinkedHashSet();
                    XPath xPath2 = xPath;
                    Intrinsics.checkNotNullExpressionValue(node2, "node");
                    XmlParsingExtensionsKt.evaluateNodeOrNull(xPath2, "TrackingEvents", node2, new Function1<Node, Integer>() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt.parseAdVerifications.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Integer invoke(Node node3) {
                            return Integer.valueOf(invoke2(node3));
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final int invoke2(@NotNull Node it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return VastDataModelFromXmlKt.addVastEvents(linkedHashSet, EventType.Tracking, xPath, it);
                        }
                    });
                    list.add(new VastVerification(XmlParsingExtensionsKt.getStringNodeAttribute(z.f66061c, node2), linkedHashSet, (VastJavaScriptResource) XmlParsingExtensionsKt.evaluateNodeOrNull(xPath, z.f66066o, node2, new Function1<Node, VastJavaScriptResource>() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt$parseAdVerifications$1$resource$1
                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final VastJavaScriptResource invoke(@NotNull Node it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            String elementValue = XmlParsingExtensionsKt.getElementValue(it);
                            String stringNodeAttribute = XmlParsingExtensionsKt.getStringNodeAttribute("apiFramework", it);
                            VerificationApiFramework verificationApiFramework = null;
                            if (stringNodeAttribute != null) {
                                VerificationApiFramework[] verificationApiFrameworkArrValues = VerificationApiFramework.values();
                                int length2 = verificationApiFrameworkArrValues.length;
                                int i11 = 0;
                                while (true) {
                                    if (i11 >= length2) {
                                        break;
                                    }
                                    VerificationApiFramework verificationApiFramework2 = verificationApiFrameworkArrValues[i11];
                                    if (Intrinsics.areEqual(verificationApiFramework2.getStringValue(), stringNodeAttribute)) {
                                        verificationApiFramework = verificationApiFramework2;
                                        break;
                                    }
                                    i11++;
                                }
                            }
                            Boolean boolNodeAttribute = XmlParsingExtensionsKt.getBoolNodeAttribute("browserOptional", it);
                            return new VastJavaScriptResource(elementValue, verificationApiFramework, boolNodeAttribute != null ? boolNodeAttribute.booleanValue() : false);
                        }
                    }), (String) XmlParsingExtensionsKt.evaluateNodeOrNull(xPath, z.f66065n, node2, new Function1<Node, String>() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt$parseAdVerifications$1$verificationParameters$1
                        @Override // kotlin.jvm.functions.Function1
                        @Nullable
                        public final String invoke(@NotNull Node it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return XmlParsingExtensionsKt.getElementValue(it);
                        }
                    })));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<VastCreative> parseCreatives(final XPath xPath, Node node) {
        final ArrayList arrayList = new ArrayList();
        XmlParsingExtensionsKt.evaluateNodesOrNull(xPath, y.f66055s, node, new Function1<NodeList, Unit>() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt.parseCreatives.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(NodeList nodeList) {
                invoke2(nodeList);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull NodeList itNodes) {
                Intrinsics.checkNotNullParameter(itNodes, "itNodes");
                int length = itNodes.getLength();
                for (int i10 = 0; i10 < length; i10++) {
                    Node node2 = itNodes.item(i10);
                    XPath xPath2 = xPath;
                    Intrinsics.checkNotNullExpressionValue(node2, "node");
                    arrayList.add(new VastCreative(XmlParsingExtensionsKt.getStringNodeAttribute("id", node2), XmlParsingExtensionsKt.getStringNodeAttribute(f.b.f45109c, node2), XmlParsingExtensionsKt.getIntNodeAttribute(w.f66047c, node2), XmlParsingExtensionsKt.getStringNodeAttribute("apiFramework", node2), VastDataModelFromXmlKt.parseUniversalAdIdList(xPath, node2), VastDataModelFromXmlKt.parseAdLinear(xPath, node2), VastDataModelFromXmlKt.parseAdCompanions(xPath, node2), (String) XmlParsingExtensionsKt.evaluateNodeOrNull(xPath2, y.f66051a, node2, new Function1<Node, String>() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt$parseCreatives$1$companionAdsRequiredMode$1
                        @Override // kotlin.jvm.functions.Function1
                        @Nullable
                        public final String invoke(@NotNull Node itRequired) {
                            Intrinsics.checkNotNullParameter(itRequired, "itRequired");
                            return XmlParsingExtensionsKt.getStringNodeAttribute(POBCoreNativeConstants.NATIVE_REQUIRED_FIELD, itRequired);
                        }
                    })));
                }
            }
        });
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<VastIcon> parseIcons(final XPath xPath, Node node) {
        List<VastIcon> list = (List) XmlParsingExtensionsKt.evaluateNodesOrNull(xPath, "Icons/Icon", node, new Function1<NodeList, List<VastIcon>>() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt.parseIcons.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final List<VastIcon> invoke(@NotNull NodeList itNodes) {
                Intrinsics.checkNotNullParameter(itNodes, "itNodes");
                ArrayList arrayList = new ArrayList();
                int length = itNodes.getLength();
                for (int i10 = 0; i10 < length; i10++) {
                    Node node2 = itNodes.item(i10);
                    final LinkedHashSet linkedHashSet = new LinkedHashSet();
                    EventType eventType = EventType.IconViewTracking;
                    XPath xPath2 = xPath;
                    Intrinsics.checkNotNullExpressionValue(node2, "node");
                    VastDataModelFromXmlKt.addVastEvents(linkedHashSet, eventType, xPath2, node2);
                    XmlParsingExtensionsKt.evaluateNodeOrNull(xPath, VastIconXmlManager.ICON_CLICKS, node2, new Function1<Node, Integer>() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt.parseIcons.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Integer invoke(Node node3) {
                            return Integer.valueOf(invoke2(node3));
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final int invoke2(@NotNull Node it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return VastDataModelFromXmlKt.addVastEvents(linkedHashSet, EventType.IconClickTracking, xPath, it);
                        }
                    });
                    VastClickThrough vastClickThrough = (VastClickThrough) XmlParsingExtensionsKt.evaluateNodeOrNull(xPath, "IconClicks/IconClickThrough", node2, new Function1<Node, VastClickThrough>() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt$parseIcons$1$clickThrough$1
                        @Override // kotlin.jvm.functions.Function1
                        @Nullable
                        public final VastClickThrough invoke(@NotNull Node it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return VastDataModelFromXmlKt.getVastClickThroughOrNull(it);
                        }
                    });
                    String stringNodeAttribute = XmlParsingExtensionsKt.getStringNodeAttribute("program", node2);
                    Integer intNodeAttribute = XmlParsingExtensionsKt.getIntNodeAttribute("width", node2);
                    Integer intNodeAttribute2 = XmlParsingExtensionsKt.getIntNodeAttribute("height", node2);
                    VastTime.Companion companion = VastTime.INSTANCE;
                    arrayList.add(new VastIcon(stringNodeAttribute, vastClickThrough, linkedHashSet, VastDataModelFromXmlKt.parseVastResource(xPath, node2), intNodeAttribute, intNodeAttribute2, companion.create(XmlParsingExtensionsKt.getStringNodeAttribute("offset", node2)), companion.create(XmlParsingExtensionsKt.getStringNodeAttribute("duration", node2))));
                }
                return arrayList;
            }
        });
        return list == null ? CollectionsKt.emptyList() : list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<VastMediaFile> parseMediaFiles(XPath xPath, Node node) {
        List<VastMediaFile> list = (List) XmlParsingExtensionsKt.evaluateNodesOrNull(xPath, s.f66021n, node, new Function1<NodeList, List<VastMediaFile>>() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt.parseMediaFiles.1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final List<VastMediaFile> invoke(@NotNull NodeList itNodes) {
                Intrinsics.checkNotNullParameter(itNodes, "itNodes");
                ArrayList arrayList = new ArrayList();
                int length = itNodes.getLength();
                for (int i10 = 0; i10 < length; i10++) {
                    Node node2 = itNodes.item(i10);
                    Intrinsics.checkNotNullExpressionValue(node2, "node");
                    String elementValue = XmlParsingExtensionsKt.getElementValue(node2);
                    Integer intNodeAttribute = XmlParsingExtensionsKt.getIntNodeAttribute("width", node2);
                    Integer intNodeAttribute2 = XmlParsingExtensionsKt.getIntNodeAttribute("height", node2);
                    arrayList.add(new VastMediaFile(XmlParsingExtensionsKt.getStringNodeAttribute("id", node2), elementValue, XmlParsingExtensionsKt.getStringNodeAttribute("delivery", node2), XmlParsingExtensionsKt.getStringNodeAttribute("type", node2), intNodeAttribute, intNodeAttribute2, XmlParsingExtensionsKt.getStringNodeAttribute("codec", node2), XmlParsingExtensionsKt.getIntNodeAttribute(a.f65992s, node2), XmlParsingExtensionsKt.getIntNodeAttribute(a.f65988a, node2), XmlParsingExtensionsKt.getIntNodeAttribute(a.f65990n, node2), XmlParsingExtensionsKt.getBoolNodeAttribute("scalable", node2), XmlParsingExtensionsKt.getBoolNodeAttribute("maintainAspectRatio", node2), XmlParsingExtensionsKt.getStringNodeAttribute("apiFramework", node2), XmlParsingExtensionsKt.getIntNodeAttribute("fileSize", node2), XmlParsingExtensionsKt.getStringNodeAttribute("mediaType", node2), (intNodeAttribute == null || intNodeAttribute2 == null) ? 0.0f : intNodeAttribute.intValue() / intNodeAttribute2.intValue(), Integer.valueOf((intNodeAttribute == null || intNodeAttribute2 == null) ? 0 : intNodeAttribute.intValue() * intNodeAttribute2.intValue())));
                }
                return arrayList;
            }
        });
        return list == null ? CollectionsKt.emptyList() : list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<VastUniversalAdId> parseUniversalAdIdList(XPath xPath, Node node) {
        List<VastUniversalAdId> list = (List) XmlParsingExtensionsKt.evaluateNodesOrNull(xPath, "UniversalAdId", node, new Function1<NodeList, List<VastUniversalAdId>>() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt.parseUniversalAdIdList.1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final List<VastUniversalAdId> invoke(@NotNull NodeList it) {
                Intrinsics.checkNotNullParameter(it, "it");
                ArrayList arrayList = new ArrayList();
                int length = it.getLength();
                for (int i10 = 0; i10 < length; i10++) {
                    Node nodeItem = it.item(i10);
                    Intrinsics.checkNotNullExpressionValue(nodeItem, "it.item(i)");
                    String elementValue = XmlParsingExtensionsKt.getElementValue(nodeItem);
                    Node nodeItem2 = it.item(i10);
                    Intrinsics.checkNotNullExpressionValue(nodeItem2, "it.item(i)");
                    arrayList.add(new VastUniversalAdId(elementValue, XmlParsingExtensionsKt.getStringNodeAttribute("idRegistry", nodeItem2)));
                }
                return arrayList;
            }
        });
        return list == null ? CollectionsKt.emptyList() : list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VastBaseResource parseVastResource(XPath xPath, Node node) {
        return (VastBaseResource) XmlParsingExtensionsKt.evaluateNodeOrNull(xPath, "IFrameResource|StaticResource|HTMLResource", node, new Function1<Node, VastBaseResource>() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt.parseVastResource.1
            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final VastBaseResource invoke(@NotNull Node it) {
                Intrinsics.checkNotNullParameter(it, "it");
                String nodeName = it.getNodeName();
                if (nodeName == null) {
                    return null;
                }
                int iHashCode = nodeName.hashCode();
                if (iHashCode == -375340334) {
                    if (nodeName.equals(VastResourceXmlManager.IFRAME_RESOURCE)) {
                        return new VastIFrameResource(XmlParsingExtensionsKt.getElementValue(it));
                    }
                    return null;
                }
                if (iHashCode == 676623548) {
                    if (nodeName.equals(VastResourceXmlManager.STATIC_RESOURCE)) {
                        return new VastStaticResource(XmlParsingExtensionsKt.getStringNodeAttribute("creativeType", it), XmlParsingExtensionsKt.getElementValue(it));
                    }
                    return null;
                }
                if (iHashCode == 1928285401 && nodeName.equals(VastResourceXmlManager.HTML_RESOURCE)) {
                    return new VastHtmlResource(XmlParsingExtensionsKt.getElementValue(it));
                }
                return null;
            }
        });
    }

    private static final Either<VastError, VastModel> parseVastXml(VastXmlParser vastXmlParser, Context context, String str, Function1<? super String, String> function1) {
        Either eitherCreateVastTagFromXml = createVastTagFromXml(str);
        if (eitherCreateVastTagFromXml instanceof ErrorResult) {
            return eitherCreateVastTagFromXml;
        }
        if (eitherCreateVastTagFromXml == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.mobilefuse.sdk.exception.SuccessResult<com.mobilefuse.videoplayer.model.VastTag>");
        }
        VastTag vastTag = (VastTag) ((SuccessResult) eitherCreateVastTagFromXml).getValue();
        vastXmlParser.getVastTagChain().add(vastTag);
        VastAd firstAd = VastDataModelExtensionsKt.getFirstAd(vastTag);
        VastAdContent content = firstAd != null ? firstAd.getContent() : null;
        if (!(content instanceof VastWrapper)) {
            VastModel vastModel = new VastModel(CollectionsKt.reversed(vastXmlParser.getVastTagChain()));
            return VastDataModelExtensionsKt.getHasAdContentToPlay(vastModel) ? new SuccessResult(vastModel) : new ErrorResult(VastError.NO_VAST_RESPONSE);
        }
        String vastAdTagUri = ((VastWrapper) content).getVastAdTagUri();
        if (vastAdTagUri == null || vastXmlParser.getVastTagChain().size() >= 10) {
            return new ErrorResult(VastError.WRAPPER_LIMIT_REACHED);
        }
        String strInvoke = function1.invoke(vastAdTagUri);
        HttpRequestTracker.logHttpRequest(strInvoke);
        Either<VastError, String> eitherLoadWrapperVast = loadWrapperVast(strInvoke);
        if (eitherLoadWrapperVast instanceof ErrorResult) {
            return new ErrorResult(VastError.URI_UNAVAILABLE_OR_TIMEOUT);
        }
        if (eitherLoadWrapperVast instanceof SuccessResult) {
            return parseVastXml(vastXmlParser, context, (String) ((SuccessResult) eitherLoadWrapperVast).getValue(), function1);
        }
        throw new m();
    }
}
