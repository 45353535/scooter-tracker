package com.startapp.sdk.ads.splash;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.g9;
import com.startapp.sdk.internal.h0;
import com.startapp.sdk.internal.vi;
import com.vungle.ads.internal.signals.SignalManager;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Deprecated
public class SplashConfig implements Serializable {
    private static final int INT_EMPTY_VALUE = -1;
    private static final String STRING_EMPTY_VALUE = "";
    private static final String VALUE_DEFAULT_HTML_BG_COLOR = "#066CAA";
    private static final String VALUE_DEFAULT_HTML_FONT_COLOR = "ffffff";
    private static final String VALUE_DEFAULT_HTML_LOADING_TYPE = "LoadingDots";
    private static final boolean VALUE_DEFAULT_HTML_SPLASH = true;
    private static final long serialVersionUID = -1014176445263003129L;
    private boolean showFromCacheOnly;
    private static final Theme VALUE_DEFAULT_THEME = Theme.OCEAN;
    private static final MinSplashTime VALUE_DEFAULT_MINSPLASHTIME = MinSplashTime.REGULAR;
    private static long DEFAULT_MAX_LOAD = 7500;
    private static final long VALUE_DEFAULT_MAXLOAD = DEFAULT_MAX_LOAD;
    private static final MaxAdDisplayTime VALUE_DEFAULT_MAXADDISPLAY = MaxAdDisplayTime.FOR_EVER;
    private static final Orientation VALUE_DEFAULT_ORIENTATION = Orientation.AUTO;
    private boolean forceNative = false;
    private int customScreen = -1;
    private String appName = "";
    private transient Drawable logo = null;
    private byte[] logoByteArray = null;
    private int logoRes = -1;

    @TypeInfo(type = Theme.class)
    private Theme defaultTheme = VALUE_DEFAULT_THEME;

    @TypeInfo(type = MinSplashTime.class)
    private MinSplashTime defaultMinSplashTime = VALUE_DEFAULT_MINSPLASHTIME;
    private Long defaultMaxLoadTime = Long.valueOf(VALUE_DEFAULT_MAXLOAD);

    @TypeInfo(type = MaxAdDisplayTime.class)
    private MaxAdDisplayTime defaultMaxAdDisplayTime = VALUE_DEFAULT_MAXADDISPLAY;

    @TypeInfo(type = Orientation.class)
    private Orientation defaultOrientation = VALUE_DEFAULT_ORIENTATION;

    @Nullable
    @TypeInfo(type = Animation.class)
    private Animation animation = Animation.ALL;
    private boolean htmlSplash = true;
    private String splashBgColor = VALUE_DEFAULT_HTML_BG_COLOR;
    private String splashFontColor = VALUE_DEFAULT_HTML_FONT_COLOR;
    private String splashLoadingType = VALUE_DEFAULT_HTML_LOADING_TYPE;
    private transient String errMsg = "";

    @Keep
    public enum Animation {
        ALL,
        AVAILABLE_AD_ONLY,
        DISABLE
    }

    @Keep
    public enum MaxAdDisplayTime {
        SHORT(5000),
        LONG(10000),
        FOR_EVER(SignalManager.TWENTY_FOUR_HOURS_MILLIS);

        private final long index;

        MaxAdDisplayTime(long j10) {
            this.index = j10;
        }

        public static MaxAdDisplayTime getByIndex(long j10) {
            MaxAdDisplayTime maxAdDisplayTime = SHORT;
            MaxAdDisplayTime[] maxAdDisplayTimeArrValues = values();
            for (int i10 = 0; i10 < maxAdDisplayTimeArrValues.length; i10++) {
                if (maxAdDisplayTimeArrValues[i10].getIndex() == j10) {
                    maxAdDisplayTime = maxAdDisplayTimeArrValues[i10];
                }
            }
            return maxAdDisplayTime;
        }

        public static MaxAdDisplayTime getByName(String str) {
            MaxAdDisplayTime maxAdDisplayTime = FOR_EVER;
            MaxAdDisplayTime[] maxAdDisplayTimeArrValues = values();
            for (int i10 = 0; i10 < maxAdDisplayTimeArrValues.length; i10++) {
                String strName = maxAdDisplayTimeArrValues[i10].name();
                Locale locale = Locale.ROOT;
                if (strName.toLowerCase(locale).compareTo(str.toLowerCase(locale)) == 0) {
                    maxAdDisplayTime = maxAdDisplayTimeArrValues[i10];
                }
            }
            return maxAdDisplayTime;
        }

        public long getIndex() {
            return this.index;
        }
    }

    @Keep
    public enum MinSplashTime {
        REGULAR(3000),
        SHORT(2000),
        LONG(5000);

        private final long index;

        MinSplashTime(int i10) {
            this.index = i10;
        }

        public static MinSplashTime getByIndex(long j10) {
            MinSplashTime minSplashTime = SHORT;
            MinSplashTime[] minSplashTimeArrValues = values();
            for (int i10 = 0; i10 < minSplashTimeArrValues.length; i10++) {
                if (minSplashTimeArrValues[i10].getIndex() == j10) {
                    minSplashTime = minSplashTimeArrValues[i10];
                }
            }
            return minSplashTime;
        }

        public static MinSplashTime getByName(String str) {
            MinSplashTime minSplashTime = LONG;
            MinSplashTime[] minSplashTimeArrValues = values();
            for (int i10 = 0; i10 < minSplashTimeArrValues.length; i10++) {
                String strName = minSplashTimeArrValues[i10].name();
                Locale locale = Locale.ROOT;
                if (strName.toLowerCase(locale).compareTo(str.toLowerCase(locale)) == 0) {
                    minSplashTime = minSplashTimeArrValues[i10];
                }
            }
            return minSplashTime;
        }

        public long getIndex() {
            return this.index;
        }
    }

    @Keep
    public enum Orientation {
        PORTRAIT(1),
        LANDSCAPE(2),
        AUTO(3);

        private final int index;

        Orientation(int i10) {
            this.index = i10;
        }

        public int getIndex() {
            return this.index;
        }
    }

    @Keep
    public enum Theme {
        DEEP_BLUE(1),
        SKY(2),
        ASHEN_SKY(3),
        BLAZE(4),
        GLOOMY(5),
        OCEAN(6),
        USER_DEFINED(0);

        private final int index;

        Theme(int i10) {
            this.index = i10;
        }

        public static Theme getByIndex(int i10) {
            Theme theme = DEEP_BLUE;
            Theme[] themeArrValues = values();
            for (int i11 = 0; i11 < themeArrValues.length; i11++) {
                if (themeArrValues[i11].getIndex() == i10) {
                    theme = themeArrValues[i11];
                }
            }
            return theme;
        }

        public static Theme getByName(String str) {
            Theme theme = DEEP_BLUE;
            Theme[] themeArrValues = values();
            for (int i10 = 0; i10 < themeArrValues.length; i10++) {
                String strName = themeArrValues[i10].name();
                Locale locale = Locale.ROOT;
                if (strName.toLowerCase(locale).compareTo(str.toLowerCase(locale)) == 0) {
                    theme = themeArrValues[i10];
                }
            }
            return theme;
        }

        public int getIndex() {
            return this.index;
        }
    }

    @Keep
    public SplashConfig() {
    }

    private void setErrorMsg(String str) {
        this.errMsg = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SplashConfig splashConfig = (SplashConfig) obj;
            if (this.forceNative == splashConfig.forceNative && this.showFromCacheOnly == splashConfig.showFromCacheOnly && this.animation == splashConfig.animation && this.customScreen == splashConfig.customScreen && this.logoRes == splashConfig.logoRes && this.htmlSplash == splashConfig.htmlSplash && vi.a((Object) this.appName, (Object) splashConfig.appName) && Arrays.equals(this.logoByteArray, splashConfig.logoByteArray) && this.defaultTheme == splashConfig.defaultTheme && this.defaultMinSplashTime == splashConfig.defaultMinSplashTime && vi.a((Object) this.defaultMaxLoadTime, (Object) splashConfig.defaultMaxLoadTime) && this.defaultMaxAdDisplayTime == splashConfig.defaultMaxAdDisplayTime && this.defaultOrientation == splashConfig.defaultOrientation && vi.a((Object) this.splashBgColor, (Object) splashConfig.splashBgColor) && vi.a((Object) this.splashFontColor, (Object) splashConfig.splashFontColor) && vi.a((Object) this.splashLoadingType, (Object) splashConfig.splashLoadingType)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    @Keep
    public Animation getAnimationMode() {
        Animation animation = this.animation;
        return animation == null ? Animation.ALL : animation;
    }

    @Keep
    public String getAppName() {
        return this.appName;
    }

    @Keep
    public String getBgColor() {
        return this.splashBgColor;
    }

    @Keep
    public int getCustomScreen() {
        return this.customScreen;
    }

    @Keep
    public String getErrorMessage() {
        return this.errMsg;
    }

    @Keep
    public String getFontColor() {
        return this.splashFontColor;
    }

    @Keep
    public String getLoadingType() {
        return this.splashLoadingType;
    }

    @Keep
    public Drawable getLogo() {
        return this.logo;
    }

    @Keep
    public byte[] getLogoByteArray() {
        return this.logoByteArray;
    }

    @Keep
    public int getLogoRes() {
        return this.logoRes;
    }

    @Keep
    public MaxAdDisplayTime getMaxAdDisplayTime() {
        return this.defaultMaxAdDisplayTime;
    }

    protected Long getMaxLoadAdTimeout() {
        return this.defaultMaxLoadTime;
    }

    @Keep
    public MinSplashTime getMinSplashTime() {
        return this.defaultMinSplashTime;
    }

    @Keep
    public Orientation getOrientation() {
        return this.defaultOrientation;
    }

    protected Theme getTheme() {
        return this.defaultTheme;
    }

    public int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.forceNative), Integer.valueOf(this.customScreen), this.appName, Integer.valueOf(this.logoRes), this.defaultTheme, this.defaultMinSplashTime, this.defaultMaxLoadTime, this.defaultMaxAdDisplayTime, this.defaultOrientation, Boolean.valueOf(this.htmlSplash), this.splashBgColor, this.splashFontColor, this.splashLoadingType, Boolean.valueOf(this.showFromCacheOnly), this.logoByteArray, this.animation};
        WeakHashMap weakHashMap = vi.f65408a;
        return Arrays.deepHashCode(objArr);
    }

    @Keep
    public boolean isHtmlSplash() {
        if (this.forceNative) {
            return false;
        }
        return this.htmlSplash;
    }

    @Keep
    public boolean isLogoResAvailable() {
        return this.logoRes != -1;
    }

    @Keep
    public boolean isShowFromCacheOnly() {
        return this.showFromCacheOnly;
    }

    @Keep
    public SplashConfig setAppName(String str) {
        this.appName = str;
        return this;
    }

    @Keep
    public SplashConfig setCustomScreen(int i10) {
        this.customScreen = i10;
        return this;
    }

    protected SplashConfig setHtmlSplash(boolean z10) {
        this.htmlSplash = z10;
        return this;
    }

    @Keep
    public SplashConfig setLoadingType(String str) {
        this.splashLoadingType = str;
        return this;
    }

    @Keep
    public SplashConfig setLogo(int i10) {
        this.logoRes = i10;
        return this;
    }

    @Keep
    public SplashConfig setMaxAdDisplayTime(MaxAdDisplayTime maxAdDisplayTime) {
        this.defaultMaxAdDisplayTime = maxAdDisplayTime;
        return this;
    }

    protected SplashConfig setMaxLoadAdTimeout(long j10) {
        this.defaultMaxLoadTime = Long.valueOf(j10);
        return this;
    }

    @Keep
    public SplashConfig setMinSplashTime(MinSplashTime minSplashTime) {
        this.defaultMinSplashTime = minSplashTime;
        return this;
    }

    @Keep
    public SplashConfig setOrientation(Orientation orientation) {
        this.defaultOrientation = orientation;
        return this;
    }

    @Keep
    public SplashConfig setTheme(Theme theme) {
        this.defaultTheme = theme;
        return this;
    }

    protected boolean validate(Context context) {
        Drawable drawableLoadIcon;
        PackageManager packageManager;
        if (a.f63851a[getTheme().ordinal()] != 1) {
            if (getAppName().equals("")) {
                setAppName(h0.c(context));
            }
            if (getLogo() == null && getLogoByteArray() == null) {
                try {
                    if (getLogoRes() == -1) {
                        WeakHashMap weakHashMap = vi.f65408a;
                        try {
                            packageManager = context.getPackageManager();
                        } catch (Throwable th2) {
                            g9.a(th2);
                        }
                        if (packageManager != null) {
                            drawableLoadIcon = packageManager.getApplicationInfo(context.getPackageName(), 128).loadIcon(packageManager);
                            setLogo(drawableLoadIcon);
                        }
                        drawableLoadIcon = null;
                        setLogo(drawableLoadIcon);
                    } else {
                        setLogo(context.getResources().getDrawable(getLogoRes()));
                    }
                } catch (Throwable th3) {
                    g9.a(th3);
                }
            }
        } else if (getCustomScreen() == -1) {
            setErrorMsg("StartApp: Exception getting custom screen resource id, make sure it is set");
            return false;
        }
        return true;
    }

    @Keep
    public SplashConfig setLogo(byte[] bArr) {
        this.logoByteArray = bArr;
        return this;
    }

    private SplashConfig setLogo(Drawable drawable) {
        this.logo = drawable;
        return this;
    }
}
