package net.pubnative.lite.sdk.utils;

import android.content.Context;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.utils.ProxyUtils;

/* JADX INFO: loaded from: classes3.dex */
public class AtomManager {
    public static final String AD_FORMAT = "Ad format";
    public static final String AD_SESSION_DATA = "Ad_Session_Data";
    public static final String ATOM_CLASS_NAME = "com.verve.atom.sdk.Atom";
    public static final String ATOM_GET_CALCULATED_COHORTS_METHOD_NAME = "getCalculatedCohorts";
    public static final String ATOM_GET_ID_METHOD_NAME = "id";
    public static final String ATOM_INIT_LISTENER_CLASS_NAME = "com.verve.atom.sdk.Atom$AtomInitialisationListener";
    public static final String ATOM_IS_CONFIG_FETCHED_METHOD_NAME = "isConfigurationFetchSuccessful";
    public static final String ATOM_IS_DISABLED_METHOD_NAME = "isAtomDisabled";
    public static final String ATOM_NOT_FOUND_MESSAGE = "Atom not found";
    public static final String ATOM_ON_INITIALISED_METHOD_NAME = "onInitialised";
    public static final String ATOM_ON_STOPPED_METHOD_NAME = "onStopped";
    public static final String ATOM_PACKAGE_NAME = "com.verve.atom.sdk";
    public static final String ATOM_SET_AD_SESSION_DATA_METHOD_NAME = "sendAdSessionData";
    public static final String ATOM_START_METHOD_NAME = "start";
    public static final String ATOM_STOP_LISTENER_CLASS_NAME = "com.verve.atom.sdk.Atom$AtomStopListener";
    public static final String ATOM_STOP_METHOD_NAME = "stop";
    public static final String BID_PRICE = "Bid price";
    public static final String CAMPAIGN_ID = "campaign_id";
    public static final String CREATIVE_ID = "creative_id";
    public static final String RENDERING_STATUS = "Rendering_status";
    public static final String RENDERING_SUCCESS = "rendering success";
    private static final String TAG = "AtomManager";
    public static final String VIEWABILITY = "Viewability";
    private static AtomManager instance;

    AtomManager() {
    }

    public static /* synthetic */ Object a(Object obj, Method method, Object[] objArr) {
        if (!ATOM_ON_INITIALISED_METHOD_NAME.equals(method.getName()) || objArr.length != 1) {
            return null;
        }
        Object obj2 = objArr[0];
        if (!(obj2 instanceof Boolean)) {
            return null;
        }
        HyBid.setAtomStarted((Boolean) obj2);
        return null;
    }

    public static /* synthetic */ Object b(Object obj, Method method, Object[] objArr) {
        if (!ATOM_ON_STOPPED_METHOD_NAME.equals(method.getName()) || objArr.length != 1) {
            return null;
        }
        if (!(objArr[0] instanceof Boolean)) {
            return null;
        }
        HyBid.setAtomStarted(Boolean.valueOf(!((Boolean) r0).booleanValue()));
        return null;
    }

    public static List<Object> getAtomCohorts() {
        return getInstance().getAtomCohortsInstance();
    }

    public static AtomManager getInstance() {
        if (instance == null) {
            instance = new AtomManager();
        }
        return instance;
    }

    public static void initializeAtom(Context context) {
        getInstance().initializeAtomInstance(context);
    }

    public static boolean isAtomSdkConfigurationFetchSuccessful() {
        return getInstance().isAtomSdkConfigurationFetchSuccessfulInstance();
    }

    public static boolean isAtomSdkDisabled() {
        return getInstance().isAtomSdkDisabledInstance();
    }

    public static void setAdSessionData(HashMap<String, Object> map) {
        getInstance().setAdSessionDataInstance(map);
    }

    public static void stopAtom() {
        getInstance().stopAtomInstance();
    }

    protected Object createProxy(ClassLoader classLoader, Class<?> cls, ProxyUtils.ProxyMethodHandler proxyMethodHandler) {
        return ProxyUtils.createProxy(classLoader, cls, proxyMethodHandler);
    }

    protected Class<?> findClass(String str) {
        return Class.forName(str);
    }

    public List<Object> getAtomCohortsInstance() {
        try {
            Object objInvokeMethod = invokeMethod(getDeclaredMethod(findClass(ATOM_CLASS_NAME), ATOM_GET_CALCULATED_COHORTS_METHOD_NAME, new Class[0]), null, new Object[0]);
            if (objInvokeMethod instanceof List) {
                return (List) objInvokeMethod;
            }
        } catch (Exception unused) {
            Logger.d(TAG, ATOM_NOT_FOUND_MESSAGE);
        }
        return new ArrayList();
    }

    protected Method getDeclaredMethod(Class<?> cls, String str, Class<?>... clsArr) {
        return cls.getDeclaredMethod(str, clsArr);
    }

    public void initializeAtomInstance(Context context) {
        String packageName = context.getPackageName();
        try {
            Class<?> clsFindClass = findClass(ATOM_CLASS_NAME);
            Class<?> clsFindClass2 = findClass(ATOM_INIT_LISTENER_CLASS_NAME);
            invokeMethod(getDeclaredMethod(clsFindClass, "start", Context.class, String.class, Boolean.TYPE, clsFindClass2), null, context, packageName, Boolean.valueOf(HyBid.isTestMode()), createProxy(clsFindClass.getClassLoader(), clsFindClass2, new ProxyUtils.ProxyMethodHandler() { // from class: net.pubnative.lite.sdk.utils.a
                @Override // net.pubnative.lite.sdk.utils.ProxyUtils.ProxyMethodHandler
                public final Object handleMethod(Object obj, Method method, Object[] objArr) {
                    return AtomManager.a(obj, method, objArr);
                }
            }));
        } catch (Exception unused) {
            HyBid.setAtomStarted(Boolean.FALSE);
            Logger.d(TAG, ATOM_NOT_FOUND_MESSAGE);
        }
    }

    protected Object invokeMethod(Method method, Object obj, Object... objArr) {
        return method.invoke(obj, objArr);
    }

    public boolean isAtomSdkConfigurationFetchSuccessfulInstance() {
        try {
            Object objInvokeMethod = invokeMethod(getDeclaredMethod(findClass(ATOM_CLASS_NAME), ATOM_IS_CONFIG_FETCHED_METHOD_NAME, new Class[0]), null, new Object[0]);
            if (objInvokeMethod instanceof Boolean) {
                return ((Boolean) objInvokeMethod).booleanValue();
            }
            return false;
        } catch (Exception unused) {
            Logger.d(TAG, ATOM_NOT_FOUND_MESSAGE);
            return false;
        }
    }

    public boolean isAtomSdkDisabledInstance() {
        try {
            Object objInvokeMethod = invokeMethod(getDeclaredMethod(findClass(ATOM_CLASS_NAME), ATOM_IS_DISABLED_METHOD_NAME, new Class[0]), null, new Object[0]);
            if (objInvokeMethod instanceof Boolean) {
                return ((Boolean) objInvokeMethod).booleanValue();
            }
            return true;
        } catch (Exception unused) {
            Logger.d(TAG, ATOM_NOT_FOUND_MESSAGE);
            return true;
        }
    }

    public void setAdSessionDataInstance(HashMap<String, Object> map) {
        try {
            invokeMethod(getDeclaredMethod(findClass(ATOM_CLASS_NAME), ATOM_SET_AD_SESSION_DATA_METHOD_NAME, Map.class), null, map);
        } catch (Exception e10) {
            Logger.d(TAG, "Atom not found " + e10);
        }
    }

    public void stopAtomInstance() {
        try {
            Class<?> clsFindClass = findClass(ATOM_CLASS_NAME);
            Class<?> clsFindClass2 = findClass(ATOM_STOP_LISTENER_CLASS_NAME);
            invokeMethod(getDeclaredMethod(clsFindClass, ATOM_STOP_METHOD_NAME, clsFindClass2), null, createProxy(clsFindClass.getClassLoader(), clsFindClass2, new ProxyUtils.ProxyMethodHandler() { // from class: net.pubnative.lite.sdk.utils.b
                @Override // net.pubnative.lite.sdk.utils.ProxyUtils.ProxyMethodHandler
                public final Object handleMethod(Object obj, Method method, Object[] objArr) {
                    return AtomManager.b(obj, method, objArr);
                }
            }));
        } catch (Exception unused) {
            Logger.d(TAG, ATOM_NOT_FOUND_MESSAGE);
        }
    }
}
