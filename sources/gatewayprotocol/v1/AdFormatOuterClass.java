package gatewayprotocol.v1;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes12.dex */
public final class AdFormatOuterClass {

    public enum AdFormat implements Internal.EnumLite {
        AD_FORMAT_UNSPECIFIED(0),
        AD_FORMAT_INTERSTITIAL(1),
        AD_FORMAT_REWARDED(2),
        AD_FORMAT_BANNER(3),
        UNRECOGNIZED(-1);

        public static final int AD_FORMAT_BANNER_VALUE = 3;
        public static final int AD_FORMAT_INTERSTITIAL_VALUE = 1;
        public static final int AD_FORMAT_REWARDED_VALUE = 2;
        public static final int AD_FORMAT_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<AdFormat> internalValueMap = new a();
        private final int value;

        class a implements Internal.EnumLiteMap {
            a() {
            }

            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public AdFormat findValueByNumber(int i10) {
                return AdFormat.forNumber(i10);
            }
        }

        private static final class b implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final Internal.EnumVerifier f72575a = new b();

            private b() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i10) {
                return AdFormat.forNumber(i10) != null;
            }
        }

        AdFormat(int i10) {
            this.value = i10;
        }

        public static AdFormat forNumber(int i10) {
            if (i10 == 0) {
                return AD_FORMAT_UNSPECIFIED;
            }
            if (i10 == 1) {
                return AD_FORMAT_INTERSTITIAL;
            }
            if (i10 == 2) {
                return AD_FORMAT_REWARDED;
            }
            if (i10 != 3) {
                return null;
            }
            return AD_FORMAT_BANNER;
        }

        public static Internal.EnumLiteMap<AdFormat> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f72575a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static AdFormat valueOf(int i10) {
            return forNumber(i10);
        }
    }

    private AdFormatOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
