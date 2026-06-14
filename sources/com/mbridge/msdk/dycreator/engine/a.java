package com.mbridge.msdk.dycreator.engine;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.D5;
import com.mbridge.msdk.MBridgeConstans;
import com.pubmatic.sdk.common.models.POBProfileInfo;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Class[] f48079e = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final HashMap<String, Constructor> f48080f = new HashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static String f48081g = "com.mbridge.msdk.dycreator.baseview.MB";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Context f48083b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f48085d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f48082a = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f48084c = new Object[2];

    public a(Context context) {
        this.f48083b = context;
    }

    public Context a() {
        return this.f48083b;
    }

    protected View b(String str, AttributeSet attributeSet) throws ClassNotFoundException {
        return (str.equals("MBStarLevelLayoutView") || str.equals("LuckPan")) ? a(str, "", attributeSet) : a(str, f48081g, attributeSet);
    }

    public View a(String str, ViewGroup viewGroup) {
        return a(str, viewGroup, viewGroup != null);
    }

    public View a(String str, ViewGroup viewGroup, boolean z10) {
        this.f48085d = System.currentTimeMillis();
        System.out.println("INFLATING from resource: " + str);
        return a(a(str), viewGroup, z10);
    }

    private void b(XmlPullParser xmlPullParser, View view, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                if ("requestFocus".equals(name)) {
                    a(xmlPullParser, view);
                } else if (POBProfileInfo.COUNTRY_FILTERING_ALLOW_MODE.equals(name)) {
                    if (xmlPullParser.getDepth() != 0) {
                        a(xmlPullParser, view, attributeSet);
                    } else {
                        throw new InflateException("<include /> cannot be the root element");
                    }
                } else if (!"merge".equals(name)) {
                    View viewA = a(name, attributeSet);
                    ViewGroup viewGroup = (ViewGroup) view;
                    ViewGroup.LayoutParams layoutParamsGenerateLayoutParams = viewGroup.generateLayoutParams(attributeSet);
                    b(xmlPullParser, viewA, attributeSet);
                    viewGroup.addView(viewA, layoutParamsGenerateLayoutParams);
                } else {
                    throw new InflateException("<merge /> must be the root element");
                }
            }
        }
    }

    public XmlPullParser a(String str) {
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        try {
            xmlPullParserNewPullParser.setInput(new FileInputStream(str), D5.N);
            return xmlPullParserNewPullParser;
        } catch (Exception e10) {
            e10.printStackTrace();
            return xmlPullParserNewPullParser;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.view.View, android.view.ViewGroup, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.view.View] */
    public View a(XmlPullParser xmlPullParser, ViewGroup viewGroup, boolean z10) {
        int next;
        ViewGroup.LayoutParams layoutParamsGenerateLayoutParams;
        synchronized (this.f48084c) {
            try {
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
                this.f48084c[0] = this.f48083b;
                do {
                    next = xmlPullParser.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    System.out.println("**************************");
                    System.out.println("Creating root view: " + name);
                    System.out.println("**************************");
                    if (!"merge".equals(name)) {
                        View viewA = a(name, attributeSetAsAttributeSet);
                        if (viewGroup != 0) {
                            System.out.println("Creating params from root: " + ((Object) viewGroup));
                            layoutParamsGenerateLayoutParams = viewGroup.generateLayoutParams(attributeSetAsAttributeSet);
                            if (!z10) {
                                viewA.setLayoutParams(layoutParamsGenerateLayoutParams);
                            }
                        } else {
                            layoutParamsGenerateLayoutParams = null;
                        }
                        System.out.println("-----> start inflating children");
                        b(xmlPullParser, viewA, attributeSetAsAttributeSet);
                        System.out.println("-----> done inflating children");
                        if (viewGroup != 0 && z10) {
                            viewGroup.addView(viewA, layoutParamsGenerateLayoutParams);
                        }
                        if (viewGroup == 0 || !z10) {
                            viewGroup = viewA;
                        }
                    } else if (viewGroup != 0 && z10) {
                        b(xmlPullParser, viewGroup, attributeSetAsAttributeSet);
                    } else {
                        throw new InflateException("<merge /> can be used only with a valid ViewGroup root and attachToRoot=true");
                    }
                } else {
                    throw new InflateException(xmlPullParser.getPositionDescription() + ": No start tag found!");
                }
            } catch (IOException e10) {
                InflateException inflateException = new InflateException(xmlPullParser.getPositionDescription() + ": " + e10.getMessage());
                inflateException.initCause(e10);
                throw inflateException;
            } catch (XmlPullParserException e11) {
                InflateException inflateException2 = new InflateException(e11.getMessage());
                inflateException2.initCause(e11);
                throw inflateException2;
            } finally {
            }
        }
        return viewGroup;
    }

    public final View a(String str, String str2, AttributeSet attributeSet) throws InflateException, ClassNotFoundException {
        String str3;
        HashMap<String, Constructor> map = f48080f;
        Constructor<?> constructor = map.get(str);
        Class<?> clsLoadClass = null;
        if (constructor == null) {
            try {
                ClassLoader classLoader = this.f48083b.getClassLoader();
                if (str2 != null) {
                    str3 = str2 + str;
                } else {
                    str3 = str;
                }
                clsLoadClass = classLoader.loadClass(str3);
                constructor = clsLoadClass.getConstructor(f48079e);
                map.put(str, constructor);
            } catch (ClassNotFoundException e10) {
                throw e10;
            } catch (NoSuchMethodException e11) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(attributeSet.getPositionDescription());
                sb2.append(": Error inflating class ");
                if (str2 != null) {
                    str = str2 + str;
                }
                sb2.append(str);
                InflateException inflateException = new InflateException(sb2.toString());
                inflateException.initCause(e11);
                throw inflateException;
            } catch (Exception e12) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(attributeSet.getPositionDescription());
                sb3.append(": Error inflating class ");
                sb3.append(clsLoadClass == null ? "<unknown>" : clsLoadClass.getName());
                InflateException inflateException2 = new InflateException(sb3.toString());
                inflateException2.initCause(e12);
                throw inflateException2;
            }
        }
        Object[] objArr = this.f48084c;
        objArr[1] = attributeSet;
        return (View) constructor.newInstance(objArr);
    }

    View a(String str, AttributeSet attributeSet) {
        View viewA;
        if (str.equals(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW)) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        System.out.println("******** Creating view: " + str);
        try {
            if (-1 == str.indexOf(46)) {
                viewA = b(str, attributeSet);
            } else {
                viewA = a(str, (String) null, attributeSet);
            }
            System.out.println("Created view is: " + viewA);
            return viewA;
        } catch (InflateException e10) {
            throw e10;
        } catch (ClassNotFoundException e11) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException.initCause(e11);
            throw inflateException;
        } catch (Exception e12) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e12);
            throw inflateException2;
        }
    }

    private void a(XmlPullParser xmlPullParser, View view) throws XmlPullParserException, IOException {
        int next;
        view.requestFocus();
        int depth = xmlPullParser.getDepth();
        do {
            next = xmlPullParser.next();
            if (next == 3 && xmlPullParser.getDepth() <= depth) {
                return;
            }
        } while (next != 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007c A[Catch: all -> 0x0065, PHI: r8
  0x007c: PHI (r8v4 android.view.ViewGroup$LayoutParams) = (r8v3 android.view.ViewGroup$LayoutParams), (r8v5 android.view.ViewGroup$LayoutParams) binds: [B:31:0x007a, B:26:0x0071] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #2 {all -> 0x0065, blocks: (B:13:0x0044, B:14:0x0048, B:19:0x0055, B:21:0x0061, B:24:0x0067, B:33:0x007f, B:32:0x007c, B:42:0x009d, B:43:0x009e, B:44:0x00b8, B:25:0x006d, B:30:0x0076), top: B:52:0x0044, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(org.xmlpull.v1.XmlPullParser r6, android.view.View r7, android.util.AttributeSet r8) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r5 = this;
            boolean r0 = r7 instanceof android.view.ViewGroup
            if (r0 == 0) goto Lbd
            r0 = 0
            r1 = 0
            java.lang.String r2 = "layout"
            int r0 = r8.getAttributeResourceValue(r1, r2, r0)
            if (r0 != 0) goto L38
            java.lang.String r6 = r8.getAttributeValue(r1, r2)
            if (r6 != 0) goto L1c
            android.view.InflateException r6 = new android.view.InflateException
            java.lang.String r7 = "You must specifiy a layout in the include tag: <include layout=\"@layout/layoutID\" />"
            r6.<init>(r7)
            throw r6
        L1c:
            android.view.InflateException r7 = new android.view.InflateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "You must specifiy a valid layout reference. The layout ID "
            r8.append(r0)
            r8.append(r6)
            java.lang.String r6 = " is not valid."
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r7.<init>(r6)
            throw r7
        L38:
            android.content.Context r1 = r5.a()
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.XmlResourceParser r0 = r1.getLayout(r0)
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r0)     // Catch: java.lang.Throwable -> L65
        L48:
            int r2 = r0.next()     // Catch: java.lang.Throwable -> L65
            r3 = 1
            r4 = 2
            if (r2 == r4) goto L53
            if (r2 == r3) goto L53
            goto L48
        L53:
            if (r2 != r4) goto L9e
            java.lang.String r2 = r0.getName()     // Catch: java.lang.Throwable -> L65
            java.lang.String r4 = "merge"
            boolean r4 = r4.equals(r2)     // Catch: java.lang.Throwable -> L65
            if (r4 == 0) goto L67
            r5.b(r0, r7, r1)     // Catch: java.lang.Throwable -> L65
            goto L85
        L65:
            r6 = move-exception
            goto Lb9
        L67:
            android.view.View r2 = r5.a(r2, r1)     // Catch: java.lang.Throwable -> L65
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7     // Catch: java.lang.Throwable -> L65
            android.view.ViewGroup$LayoutParams r8 = r7.generateLayoutParams(r8)     // Catch: java.lang.Throwable -> L74 java.lang.RuntimeException -> L76
            if (r8 == 0) goto L7f
            goto L7c
        L74:
            r6 = move-exception
            goto L9d
        L76:
            android.view.ViewGroup$LayoutParams r8 = r7.generateLayoutParams(r1)     // Catch: java.lang.Throwable -> L74
            if (r8 == 0) goto L7f
        L7c:
            r2.setLayoutParams(r8)     // Catch: java.lang.Throwable -> L65
        L7f:
            r5.b(r0, r2, r1)     // Catch: java.lang.Throwable -> L65
            r7.addView(r2)     // Catch: java.lang.Throwable -> L65
        L85:
            r0.close()
            int r7 = r6.getDepth()
        L8c:
            int r8 = r6.next()
            r0 = 3
            if (r8 != r0) goto L99
            int r0 = r6.getDepth()
            if (r0 <= r7) goto L9c
        L99:
            if (r8 == r3) goto L9c
            goto L8c
        L9c:
            return
        L9d:
            throw r6     // Catch: java.lang.Throwable -> L65
        L9e:
            android.view.InflateException r6 = new android.view.InflateException     // Catch: java.lang.Throwable -> L65
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L65
            r7.<init>()     // Catch: java.lang.Throwable -> L65
            java.lang.String r8 = r0.getPositionDescription()     // Catch: java.lang.Throwable -> L65
            r7.append(r8)     // Catch: java.lang.Throwable -> L65
            java.lang.String r8 = ": No start tag found!"
            r7.append(r8)     // Catch: java.lang.Throwable -> L65
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L65
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L65
            throw r6     // Catch: java.lang.Throwable -> L65
        Lb9:
            r0.close()
            throw r6
        Lbd:
            android.view.InflateException r6 = new android.view.InflateException
            java.lang.String r7 = "<include /> can only be used inside of a ViewGroup"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.dycreator.engine.a.a(org.xmlpull.v1.XmlPullParser, android.view.View, android.util.AttributeSet):void");
    }
}
