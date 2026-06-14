package io.sentry.protocol;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.t1;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class DebugImage implements d2 {
    public static final String JVM = "jvm";
    public static final String PROGUARD = "proguard";

    @Nullable
    private String arch;

    @Nullable
    private String codeFile;

    @Nullable
    private String codeId;

    @Nullable
    private String debugFile;

    @Nullable
    private String debugId;

    @Nullable
    private String imageAddr;

    @Nullable
    private Long imageSize;

    @Nullable
    private String type;

    @Nullable
    private Map<String, Object> unknown;

    @Nullable
    private String uuid;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DebugImage a(m3 m3Var, ILogger iLogger) {
            String strNextName;
            DebugImage debugImage = new DebugImage();
            m3Var.beginObject();
            HashMap map = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strNextName = m3Var.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "debug_file":
                        debugImage.debugFile = m3Var.G();
                        break;
                    case "image_addr":
                        debugImage.imageAddr = m3Var.G();
                        break;
                    case "image_size":
                        debugImage.imageSize = m3Var.g0();
                        break;
                    case "code_file":
                        debugImage.codeFile = m3Var.G();
                        break;
                    case "arch":
                        debugImage.arch = m3Var.G();
                        break;
                    case "type":
                        debugImage.type = m3Var.G();
                        break;
                    case "uuid":
                        debugImage.uuid = m3Var.G();
                        break;
                    case "debug_id":
                        debugImage.debugId = m3Var.G();
                        break;
                    case "code_id":
                        debugImage.codeId = m3Var.G();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        m3Var.l0(iLogger, map, strNextName);
                        break;
                }
            }
            m3Var.endObject();
            debugImage.setUnknown(map);
            return debugImage;
        }
    }

    @Nullable
    public String getArch() {
        return this.arch;
    }

    @Nullable
    public String getCodeFile() {
        return this.codeFile;
    }

    @Nullable
    public String getCodeId() {
        return this.codeId;
    }

    @Nullable
    public String getDebugFile() {
        return this.debugFile;
    }

    @Nullable
    public String getDebugId() {
        return this.debugId;
    }

    @Nullable
    public String getImageAddr() {
        return this.imageAddr;
    }

    @Nullable
    public Long getImageSize() {
        return this.imageSize;
    }

    @Nullable
    public String getType() {
        return this.type;
    }

    @Nullable
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Nullable
    public String getUuid() {
        return this.uuid;
    }

    @Override // io.sentry.d2
    public void serialize(@NotNull n3 n3Var, @NotNull ILogger iLogger) throws IOException {
        n3Var.beginObject();
        if (this.uuid != null) {
            n3Var.e(CommonUrlParts.UUID).a(this.uuid);
        }
        if (this.type != null) {
            n3Var.e("type").a(this.type);
        }
        if (this.debugId != null) {
            n3Var.e("debug_id").a(this.debugId);
        }
        if (this.debugFile != null) {
            n3Var.e("debug_file").a(this.debugFile);
        }
        if (this.codeId != null) {
            n3Var.e("code_id").a(this.codeId);
        }
        if (this.codeFile != null) {
            n3Var.e("code_file").a(this.codeFile);
        }
        if (this.imageAddr != null) {
            n3Var.e("image_addr").a(this.imageAddr);
        }
        if (this.imageSize != null) {
            n3Var.e(CampaignEx.JSON_KEY_IMAGE_SIZE).i(this.imageSize);
        }
        if (this.arch != null) {
            n3Var.e("arch").a(this.arch);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                n3Var.e(str).j(iLogger, this.unknown.get(str));
            }
        }
        n3Var.endObject();
    }

    public void setArch(@Nullable String str) {
        this.arch = str;
    }

    public void setCodeFile(@Nullable String str) {
        this.codeFile = str;
    }

    public void setCodeId(@Nullable String str) {
        this.codeId = str;
    }

    public void setDebugFile(@Nullable String str) {
        this.debugFile = str;
    }

    public void setDebugId(@Nullable String str) {
        this.debugId = str;
    }

    public void setImageAddr(@Nullable String str) {
        this.imageAddr = str;
    }

    public void setImageSize(@Nullable Long l10) {
        this.imageSize = l10;
    }

    public void setType(@Nullable String str) {
        this.type = str;
    }

    public void setUnknown(@Nullable Map<String, Object> map) {
        this.unknown = map;
    }

    public void setUuid(@Nullable String str) {
        this.uuid = str;
    }

    public void setImageSize(long j10) {
        this.imageSize = Long.valueOf(j10);
    }
}
