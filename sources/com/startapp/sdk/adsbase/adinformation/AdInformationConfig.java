package com.startapp.sdk.adsbase.adinformation;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.startapp.json.TypeInfo;
import com.startapp.sdk.adsbase.adinformation.AdInformationPositions;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.internal.uf;
import com.startapp.sdk.internal.vf;
import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
@Keep
public class AdInformationConfig implements Serializable {
    private static final String DEFAULT_DIALOG_URL = "https://funnel-assets.startappservice.com/consent/index.html";
    protected static final boolean DEFAULT_EANBLED = true;
    private static final String DEFAULT_EULA_URL = "https://www.startapp.com/policy/privacy-policy/";
    private static final float DEFAULT_FAT_FINGERS_FACTOR = 200.0f;
    private static final long serialVersionUID = 8911501868319500986L;

    @Nullable
    private Integer consentTypeInfo;
    private boolean enabled = true;
    private float fatFingersFactor = 200.0f;
    private String dialogUrlSecured = DEFAULT_DIALOG_URL;
    private String eulaUrlSecured = DEFAULT_EULA_URL;

    @TypeInfo(key = AdPreferences.Placement.class, type = HashMap.class, value = AdInformationPositions.Position.class)
    protected HashMap<AdPreferences.Placement, AdInformationPositions.Position> Positions = new HashMap<>();
    private transient EnumMap<ImageResourceType, ImageResourceConfig> imageResources = new EnumMap<>(ImageResourceType.class);

    @TypeInfo(type = ArrayList.class, value = ImageResourceConfig.class)
    private List<ImageResourceConfig> ImageResources = new ArrayList();

    @Keep
    public enum ImageResourceType {
        INFO_S(17, 14),
        INFO_EX_S(88, 14),
        INFO_L(25, 21),
        INFO_EX_L(130, 21);

        private final int height;
        private final int width;

        ImageResourceType(int i10, int i11) {
            this.width = i10;
            this.height = i11;
        }

        public static ImageResourceType getByName(String str) {
            ImageResourceType imageResourceType = INFO_S;
            for (ImageResourceType imageResourceType2 : values()) {
                String strName = imageResourceType2.name();
                Locale locale = Locale.ROOT;
                if (strName.toLowerCase(locale).compareTo(str.toLowerCase(locale)) == 0) {
                    imageResourceType = imageResourceType2;
                }
            }
            return imageResourceType;
        }

        public int getDefaultHeight() {
            return this.height;
        }

        public int getDefaultWidth() {
            return this.width;
        }
    }

    @Keep
    private AdInformationConfig() {
    }

    @Keep
    public static AdInformationConfig createAdInformationConfig() {
        AdInformationConfig adInformationConfig = new AdInformationConfig();
        setDefaultValues(adInformationConfig);
        return adInformationConfig;
    }

    @Keep
    public static void setDefaultValues(AdInformationConfig adInformationConfig) {
        adInformationConfig.updateFallbackImageResources();
        adInformationConfig.validateImageResourcesConfig();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AdInformationConfig adInformationConfig = (AdInformationConfig) obj;
            if (this.enabled == adInformationConfig.enabled && Float.compare(adInformationConfig.fatFingersFactor, this.fatFingersFactor) == 0 && vi.a((Object) this.consentTypeInfo, (Object) adInformationConfig.consentTypeInfo) && vi.a((Object) this.dialogUrlSecured, (Object) adInformationConfig.dialogUrlSecured) && vi.a((Object) this.eulaUrlSecured, (Object) adInformationConfig.eulaUrlSecured) && vi.a((Object) this.Positions, (Object) adInformationConfig.Positions) && vi.a(this.ImageResources, adInformationConfig.ImageResources)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    @Keep
    public Integer getConsentTypeInfo() {
        return this.consentTypeInfo;
    }

    @NonNull
    @Keep
    public String getDialogUrl() {
        String str = this.dialogUrlSecured;
        return str != null ? str : DEFAULT_DIALOG_URL;
    }

    @Keep
    public String getEulaUrl() {
        String str = this.eulaUrlSecured;
        return (str == null || str.equals("")) ? DEFAULT_EULA_URL : this.eulaUrlSecured;
    }

    @Keep
    public float getFatFingerFactor() {
        return this.fatFingersFactor / 100.0f;
    }

    @Keep
    public ImageResourceConfig getImageResourceConfig(ImageResourceType imageResourceType) {
        return getImageResources().get(imageResourceType);
    }

    @Keep
    public EnumMap<ImageResourceType, ImageResourceConfig> getImageResources() {
        return this.imageResources;
    }

    @Keep
    public AdInformationPositions.Position getPosition(AdPreferences.Placement placement) {
        AdInformationPositions.Position position = this.Positions.get(placement);
        if (position != null) {
            return position;
        }
        AdInformationPositions.Position position2 = AdInformationPositions.Position.BOTTOM_LEFT;
        this.Positions.put(placement, position2);
        return position2;
    }

    @Keep
    public String getPrivacyIconImageUrl() {
        EnumMap<ImageResourceType, ImageResourceConfig> enumMap = this.imageResources;
        ImageResourceType imageResourceType = ImageResourceType.INFO_L;
        return (!enumMap.containsKey(imageResourceType) || this.imageResources.get(imageResourceType).b().equals("")) ? "https://info.startappservice.com/InApp/resources/info_l.png" : this.imageResources.get(imageResourceType).b();
    }

    public int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.enabled), this.consentTypeInfo, Float.valueOf(this.fatFingersFactor), this.dialogUrlSecured, this.eulaUrlSecured, this.Positions, this.ImageResources};
        WeakHashMap weakHashMap = vi.f65408a;
        return Arrays.deepHashCode(objArr);
    }

    @Keep
    public void initImageResourceConfigBitmaps(@NonNull Context context) {
        for (ImageResourceConfig imageResourceConfig : this.ImageResources) {
            setImageResourceConfig(ImageResourceType.getByName(imageResourceConfig.c()), imageResourceConfig);
            imageResourceConfig.b(context);
        }
    }

    @Keep
    public void initTransientFields() {
        this.imageResources = new EnumMap<>(ImageResourceType.class);
    }

    @Keep
    public boolean isEnabled(Context context) {
        return !((vf) com.startapp.sdk.components.a.a(context).G.a()).getBoolean("userDisabledAdInformation", false) && isMetaDataEnabled();
    }

    @Keep
    public boolean isMetaDataEnabled() {
        return this.enabled;
    }

    protected void setImageResourceConfig(ImageResourceType imageResourceType, ImageResourceConfig imageResourceConfig) {
        getImageResources().put(imageResourceType, imageResourceConfig);
    }

    @Keep
    public void setUserEnabled(Context context, boolean z10) {
        uf ufVarEdit = ((vf) com.startapp.sdk.components.a.a(context).G.a()).edit();
        boolean z11 = !z10;
        ufVarEdit.a("userDisabledAdInformation", Boolean.valueOf(z11));
        ufVarEdit.f65346a.putBoolean("userDisabledAdInformation", z11);
        ufVarEdit.apply();
    }

    protected void updateFallbackImageResources() {
        boolean z10;
        for (ImageResourceType imageResourceType : ImageResourceType.values()) {
            ImageResourceConfig imageResourceConfigA = getImageResources().get(imageResourceType);
            if (imageResourceConfigA == null) {
                imageResourceConfigA = ImageResourceConfig.a(imageResourceType.name());
                Iterator<ImageResourceConfig> it = this.ImageResources.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (ImageResourceType.getByName(it.next().c()).equals(imageResourceType)) {
                            z10 = false;
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                getImageResources().put(imageResourceType, imageResourceConfigA);
                if (z10) {
                    this.ImageResources.add(imageResourceConfigA);
                }
            }
            imageResourceConfigA.b(imageResourceType.getDefaultWidth());
            imageResourceConfigA.a(imageResourceType.getDefaultHeight());
            imageResourceConfigA.b(imageResourceType.name().toLowerCase(Locale.ROOT) + ".png");
        }
    }

    protected void validateImageResourcesConfig() {
        for (ImageResourceType imageResourceType : ImageResourceType.values()) {
            if (getImageResources().get(imageResourceType) == null) {
                throw new IllegalArgumentException(String.valueOf(imageResourceType));
            }
        }
    }
}
