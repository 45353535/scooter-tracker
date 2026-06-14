package com.google.common.net;

import androidx.webkit.ProxyConfig;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Ascii;
import com.google.common.base.CharMatcher;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;
import com.google.common.collect.UnmodifiableIterator;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import com.ironsource.C4240b4;
import com.ironsource.D5;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.appmetrica.analytics.BuildConfig;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import net.pubnative.lite.sdk.mraid.MRAIDNativeFeature;

/* JADX INFO: loaded from: classes9.dex */
@Immutable
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class MediaType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ImmutableListMultimap f31054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f31055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f31056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Optional f31057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ImmutableListMultimap f31046g = ImmutableListMultimap.of(D5.M, Ascii.toLowerCase(StandardCharsets.UTF_8.name()));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final CharMatcher f31047h = CharMatcher.ascii().and(CharMatcher.javaIsoControl().negate()).and(CharMatcher.isNot(' ')).and(CharMatcher.noneOf("()<>@,;:\\\"/[]?="));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final CharMatcher f31048i = CharMatcher.ascii().and(CharMatcher.noneOf("\"\\\r"));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final CharMatcher f31049j = CharMatcher.anyOf(" \t\r\n");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Map f31050k = Maps.newHashMap();
    public static final MediaType ANY_TYPE = f(ProxyConfig.MATCH_ALL_SCHEMES, ProxyConfig.MATCH_ALL_SCHEMES);
    public static final MediaType ANY_TEXT_TYPE = f("text", ProxyConfig.MATCH_ALL_SCHEMES);
    public static final MediaType ANY_IMAGE_TYPE = f("image", ProxyConfig.MATCH_ALL_SCHEMES);
    public static final MediaType ANY_AUDIO_TYPE = f("audio", ProxyConfig.MATCH_ALL_SCHEMES);
    public static final MediaType ANY_VIDEO_TYPE = f("video", ProxyConfig.MATCH_ALL_SCHEMES);
    public static final MediaType ANY_APPLICATION_TYPE = f("application", ProxyConfig.MATCH_ALL_SCHEMES);
    public static final MediaType ANY_FONT_TYPE = f("font", ProxyConfig.MATCH_ALL_SCHEMES);
    public static final MediaType CACHE_MANIFEST_UTF_8 = g("text", "cache-manifest");
    public static final MediaType CSS_UTF_8 = g("text", "css");
    public static final MediaType CSV_UTF_8 = g("text", com.taurusx.tax.g.a.f66075g);
    public static final MediaType HTML_UTF_8 = g("text", "html");
    public static final MediaType I_CALENDAR_UTF_8 = g("text", MRAIDNativeFeature.CALENDAR);
    public static final MediaType MD_UTF_8 = g("text", "markdown");
    public static final MediaType PLAIN_TEXT_UTF_8 = g("text", "plain");
    public static final MediaType TEXT_JAVASCRIPT_UTF_8 = g("text", "javascript");
    public static final MediaType TSV_UTF_8 = g("text", "tab-separated-values");
    public static final MediaType VCARD_UTF_8 = g("text", "vcard");
    public static final MediaType WML_UTF_8 = g("text", "vnd.wap.wml");
    public static final MediaType XML_UTF_8 = g("text", "xml");
    public static final MediaType VTT_UTF_8 = g("text", "vtt");
    public static final MediaType BMP = f("image", "bmp");
    public static final MediaType CRW = f("image", "x-canon-crw");
    public static final MediaType GIF = f("image", "gif");
    public static final MediaType ICO = f("image", "vnd.microsoft.icon");
    public static final MediaType JPEG = f("image", "jpeg");
    public static final MediaType PNG = f("image", "png");
    public static final MediaType PSD = f("image", "vnd.adobe.photoshop");
    public static final MediaType SVG_UTF_8 = g("image", "svg+xml");
    public static final MediaType TIFF = f("image", "tiff");
    public static final MediaType WEBP = f("image", "webp");
    public static final MediaType HEIF = f("image", "heif");
    public static final MediaType JP2K = f("image", "jp2");
    public static final MediaType MP4_AUDIO = f("audio", "mp4");
    public static final MediaType MPEG_AUDIO = f("audio", "mpeg");
    public static final MediaType OGG_AUDIO = f("audio", "ogg");
    public static final MediaType WEBM_AUDIO = f("audio", "webm");
    public static final MediaType L16_AUDIO = f("audio", "l16");
    public static final MediaType L24_AUDIO = f("audio", "l24");
    public static final MediaType BASIC_AUDIO = f("audio", "basic");
    public static final MediaType AAC_AUDIO = f("audio", "aac");
    public static final MediaType VORBIS_AUDIO = f("audio", "vorbis");
    public static final MediaType WMA_AUDIO = f("audio", "x-ms-wma");
    public static final MediaType WAX_AUDIO = f("audio", "x-ms-wax");
    public static final MediaType VND_REAL_AUDIO = f("audio", "vnd.rn-realaudio");
    public static final MediaType VND_WAVE_AUDIO = f("audio", "vnd.wave");
    public static final MediaType MP4_VIDEO = f("video", "mp4");
    public static final MediaType MPEG_VIDEO = f("video", "mpeg");
    public static final MediaType OGG_VIDEO = f("video", "ogg");
    public static final MediaType QUICKTIME = f("video", "quicktime");
    public static final MediaType WEBM_VIDEO = f("video", "webm");
    public static final MediaType WMV = f("video", "x-ms-wmv");
    public static final MediaType FLV_VIDEO = f("video", "x-flv");
    public static final MediaType THREE_GPP_VIDEO = f("video", "3gpp");
    public static final MediaType THREE_GPP2_VIDEO = f("video", "3gpp2");
    public static final MediaType APPLICATION_XML_UTF_8 = g("application", "xml");
    public static final MediaType ATOM_UTF_8 = g("application", "atom+xml");
    public static final MediaType BZIP2 = f("application", "x-bzip2");
    public static final MediaType DART_UTF_8 = g("application", "dart");
    public static final MediaType APPLE_PASSBOOK = f("application", "vnd.apple.pkpass");
    public static final MediaType EOT = f("application", "vnd.ms-fontobject");
    public static final MediaType EPUB = f("application", "epub+zip");
    public static final MediaType FORM_DATA = f("application", "x-www-form-urlencoded");
    public static final MediaType KEY_ARCHIVE = f("application", "pkcs12");
    public static final MediaType APPLICATION_BINARY = f("application", BuildConfig.SDK_DEPENDENCY);
    public static final MediaType GEO_JSON = f("application", "geo+json");
    public static final MediaType GZIP = f("application", "x-gzip");
    public static final MediaType HAL_JSON = f("application", "hal+json");
    public static final MediaType JAVASCRIPT_UTF_8 = g("application", "javascript");
    public static final MediaType JOSE = f("application", "jose");
    public static final MediaType JOSE_JSON = f("application", "jose+json");
    public static final MediaType JSON_UTF_8 = g("application", "json");
    public static final MediaType JWT = f("application", "jwt");
    public static final MediaType MANIFEST_JSON_UTF_8 = g("application", "manifest+json");
    public static final MediaType KML = f("application", "vnd.google-earth.kml+xml");
    public static final MediaType KMZ = f("application", "vnd.google-earth.kmz");
    public static final MediaType MBOX = f("application", "mbox");
    public static final MediaType APPLE_MOBILE_CONFIG = f("application", "x-apple-aspen-config");
    public static final MediaType MICROSOFT_EXCEL = f("application", "vnd.ms-excel");
    public static final MediaType MICROSOFT_OUTLOOK = f("application", "vnd.ms-outlook");
    public static final MediaType MICROSOFT_POWERPOINT = f("application", "vnd.ms-powerpoint");
    public static final MediaType MICROSOFT_WORD = f("application", "msword");
    public static final MediaType MEDIA_PRESENTATION_DESCRIPTION = f("application", "dash+xml");
    public static final MediaType WASM_APPLICATION = f("application", "wasm");
    public static final MediaType NACL_APPLICATION = f("application", "x-nacl");
    public static final MediaType NACL_PORTABLE_APPLICATION = f("application", "x-pnacl");
    public static final MediaType OCTET_STREAM = f("application", "octet-stream");
    public static final MediaType OGG_CONTAINER = f("application", "ogg");
    public static final MediaType OOXML_DOCUMENT = f("application", "vnd.openxmlformats-officedocument.wordprocessingml.document");
    public static final MediaType OOXML_PRESENTATION = f("application", "vnd.openxmlformats-officedocument.presentationml.presentation");
    public static final MediaType OOXML_SHEET = f("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet");
    public static final MediaType OPENDOCUMENT_GRAPHICS = f("application", "vnd.oasis.opendocument.graphics");
    public static final MediaType OPENDOCUMENT_PRESENTATION = f("application", "vnd.oasis.opendocument.presentation");
    public static final MediaType OPENDOCUMENT_SPREADSHEET = f("application", "vnd.oasis.opendocument.spreadsheet");
    public static final MediaType OPENDOCUMENT_TEXT = f("application", "vnd.oasis.opendocument.text");
    public static final MediaType OPENSEARCH_DESCRIPTION_UTF_8 = g("application", "opensearchdescription+xml");
    public static final MediaType PDF = f("application", "pdf");
    public static final MediaType POSTSCRIPT = f("application", "postscript");
    public static final MediaType PROTOBUF = f("application", "protobuf");
    public static final MediaType RDF_XML_UTF_8 = g("application", "rdf+xml");
    public static final MediaType RTF_UTF_8 = g("application", "rtf");
    public static final MediaType SFNT = f("application", "font-sfnt");
    public static final MediaType SHOCKWAVE_FLASH = f("application", "x-shockwave-flash");
    public static final MediaType SKETCHUP = f("application", "vnd.sketchup.skp");
    public static final MediaType SOAP_XML_UTF_8 = g("application", "soap+xml");
    public static final MediaType TAR = f("application", "x-tar");
    public static final MediaType WOFF = f("application", "font-woff");
    public static final MediaType WOFF2 = f("application", "font-woff2");
    public static final MediaType XHTML_UTF_8 = g("application", "xhtml+xml");
    public static final MediaType XRD_UTF_8 = g("application", "xrd+xml");
    public static final MediaType ZIP = f("application", "zip");
    public static final MediaType FONT_COLLECTION = f("font", "collection");
    public static final MediaType FONT_OTF = f("font", "otf");
    public static final MediaType FONT_SFNT = f("font", "sfnt");
    public static final MediaType FONT_TTF = f("font", "ttf");
    public static final MediaType FONT_WOFF = f("font", "woff");
    public static final MediaType FONT_WOFF2 = f("font", "woff2");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Joiner.MapJoiner f31051l = Joiner.on("; ").withKeyValueSeparator(C4240b4.j.f42668b);

    private static final class Tokenizer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f31058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f31059b = 0;

        Tokenizer(String str) {
            this.f31058a = str;
        }

        char a(char c10) {
            Preconditions.checkState(e());
            Preconditions.checkState(f() == c10);
            this.f31059b++;
            return c10;
        }

        char b(CharMatcher charMatcher) {
            Preconditions.checkState(e());
            char cF = f();
            Preconditions.checkState(charMatcher.matches(cF));
            this.f31059b++;
            return cF;
        }

        String c(CharMatcher charMatcher) {
            int i10 = this.f31059b;
            String strD = d(charMatcher);
            Preconditions.checkState(this.f31059b != i10);
            return strD;
        }

        String d(CharMatcher charMatcher) {
            Preconditions.checkState(e());
            int i10 = this.f31059b;
            this.f31059b = charMatcher.negate().indexIn(this.f31058a, i10);
            return e() ? this.f31058a.substring(i10, this.f31059b) : this.f31058a.substring(i10);
        }

        boolean e() {
            int i10 = this.f31059b;
            return i10 >= 0 && i10 < this.f31058a.length();
        }

        char f() {
            Preconditions.checkState(e());
            return this.f31058a.charAt(this.f31059b);
        }
    }

    private MediaType(String str, String str2, ImmutableListMultimap immutableListMultimap) {
        this.f31052a = str;
        this.f31053b = str2;
        this.f31054c = immutableListMultimap;
    }

    public static /* synthetic */ String a(String str) {
        return (!f31047h.matchesAllOf(str) || str.isEmpty()) ? h(str) : str;
    }

    private static MediaType b(MediaType mediaType) {
        f31050k.put(mediaType, mediaType);
        return mediaType;
    }

    private String c() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f31052a);
        sb2.append(IOUtils.DIR_SEPARATOR_UNIX);
        sb2.append(this.f31053b);
        if (!this.f31054c.isEmpty()) {
            sb2.append("; ");
            f31051l.appendTo(sb2, Multimaps.transformValues((ListMultimap) this.f31054c, new Function() { // from class: com.google.common.net.a
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    return MediaType.a((String) obj);
                }
            }).entries());
        }
        return sb2.toString();
    }

    public static MediaType create(String str, String str2) {
        MediaType mediaTypeE = e(str, str2, ImmutableListMultimap.of());
        mediaTypeE.f31057f = Optional.absent();
        return mediaTypeE;
    }

    private static void d(Tokenizer tokenizer, char c10) {
        CharMatcher charMatcher = f31049j;
        tokenizer.d(charMatcher);
        tokenizer.a(c10);
        tokenizer.d(charMatcher);
    }

    private static MediaType e(String str, String str2, Multimap multimap) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(str2);
        Preconditions.checkNotNull(multimap);
        String strJ = j(str);
        String strJ2 = j(str2);
        Preconditions.checkArgument(!ProxyConfig.MATCH_ALL_SCHEMES.equals(strJ) || ProxyConfig.MATCH_ALL_SCHEMES.equals(strJ2), "A wildcard type cannot be used with a non-wildcard subtype");
        ImmutableListMultimap.Builder builder = ImmutableListMultimap.builder();
        for (Map.Entry entry : multimap.entries()) {
            String strJ3 = j((String) entry.getKey());
            builder.put(strJ3, i(strJ3, (String) entry.getValue()));
        }
        MediaType mediaType = new MediaType(strJ, strJ2, builder.build());
        return (MediaType) MoreObjects.firstNonNull((MediaType) f31050k.get(mediaType), mediaType);
    }

    private static MediaType f(String str, String str2) {
        MediaType mediaTypeB = b(new MediaType(str, str2, ImmutableListMultimap.of()));
        mediaTypeB.f31057f = Optional.absent();
        return mediaTypeB;
    }

    private static MediaType g(String str, String str2) {
        MediaType mediaTypeB = b(new MediaType(str, str2, f31046g));
        mediaTypeB.f31057f = Optional.of(StandardCharsets.UTF_8);
        return mediaTypeB;
    }

    private static String h(String str) {
        StringBuilder sb2 = new StringBuilder(str.length() + 16);
        sb2.append('\"');
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\r' || cCharAt == '\\' || cCharAt == '\"') {
                sb2.append(IOUtils.DIR_SEPARATOR_WINDOWS);
            }
            sb2.append(cCharAt);
        }
        sb2.append('\"');
        return sb2.toString();
    }

    private static String i(String str, String str2) {
        Preconditions.checkNotNull(str2);
        Preconditions.checkArgument(CharMatcher.ascii().matchesAllOf(str2), "parameter values must be ASCII: %s", str2);
        return D5.M.equals(str) ? Ascii.toLowerCase(str2) : str2;
    }

    private static String j(String str) {
        Preconditions.checkArgument(f31047h.matchesAllOf(str));
        Preconditions.checkArgument(!str.isEmpty());
        return Ascii.toLowerCase(str);
    }

    private Map k() {
        return Maps.transformValues(this.f31054c.asMap(), new Function() { // from class: com.google.common.net.b
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return ImmutableMultiset.copyOf((Collection) obj);
            }
        });
    }

    @CanIgnoreReturnValue
    public static MediaType parse(String str) {
        String strC;
        Preconditions.checkNotNull(str);
        Tokenizer tokenizer = new Tokenizer(str);
        try {
            CharMatcher charMatcher = f31047h;
            String strC2 = tokenizer.c(charMatcher);
            d(tokenizer, IOUtils.DIR_SEPARATOR_UNIX);
            String strC3 = tokenizer.c(charMatcher);
            ImmutableListMultimap.Builder builder = ImmutableListMultimap.builder();
            while (tokenizer.e()) {
                d(tokenizer, ';');
                CharMatcher charMatcher2 = f31047h;
                String strC4 = tokenizer.c(charMatcher2);
                d(tokenizer, D5.T);
                if ('\"' == tokenizer.f()) {
                    tokenizer.a('\"');
                    StringBuilder sb2 = new StringBuilder();
                    while ('\"' != tokenizer.f()) {
                        if ('\\' == tokenizer.f()) {
                            tokenizer.a(IOUtils.DIR_SEPARATOR_WINDOWS);
                            sb2.append(tokenizer.b(CharMatcher.ascii()));
                        } else {
                            sb2.append(tokenizer.c(f31048i));
                        }
                    }
                    strC = sb2.toString();
                    tokenizer.a('\"');
                } else {
                    strC = tokenizer.c(charMatcher2);
                }
                builder.put(strC4, strC);
            }
            return e(strC2, strC3, builder.build());
        } catch (IllegalStateException e10) {
            throw new IllegalArgumentException("Could not parse '" + str + "'", e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Optional<Charset> charset() {
        Optional<Charset> optionalAbsent = this.f31057f;
        if (optionalAbsent == null) {
            optionalAbsent = Optional.absent();
            UnmodifiableIterator it = this.f31054c.get(D5.M).iterator();
            String str = null;
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str == null) {
                    optionalAbsent = Optional.of(Charset.forName(str2));
                    str = str2;
                } else if (!str.equals(str2)) {
                    throw new IllegalStateException("Multiple charset values defined: " + str + ", " + str2);
                }
            }
            this.f31057f = optionalAbsent;
        }
        return optionalAbsent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MediaType) {
            MediaType mediaType = (MediaType) obj;
            if (this.f31052a.equals(mediaType.f31052a) && this.f31053b.equals(mediaType.f31053b) && k().equals(mediaType.k())) {
                return true;
            }
        }
        return false;
    }

    public boolean hasWildcard() {
        return ProxyConfig.MATCH_ALL_SCHEMES.equals(this.f31052a) || ProxyConfig.MATCH_ALL_SCHEMES.equals(this.f31053b);
    }

    public int hashCode() {
        int i10 = this.f31056e;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = Objects.hashCode(this.f31052a, this.f31053b, k());
        this.f31056e = iHashCode;
        return iHashCode;
    }

    public boolean is(MediaType mediaType) {
        if (mediaType.f31052a.equals(ProxyConfig.MATCH_ALL_SCHEMES) || mediaType.f31052a.equals(this.f31052a)) {
            return (mediaType.f31053b.equals(ProxyConfig.MATCH_ALL_SCHEMES) || mediaType.f31053b.equals(this.f31053b)) && this.f31054c.entries().containsAll(mediaType.f31054c.entries());
        }
        return false;
    }

    public ImmutableListMultimap<String, String> parameters() {
        return this.f31054c;
    }

    public String subtype() {
        return this.f31053b;
    }

    public String toString() {
        String str = this.f31055d;
        if (str != null) {
            return str;
        }
        String strC = c();
        this.f31055d = strC;
        return strC;
    }

    public String type() {
        return this.f31052a;
    }

    public MediaType withCharset(Charset charset) {
        Preconditions.checkNotNull(charset);
        MediaType mediaTypeWithParameter = withParameter(D5.M, charset.name());
        mediaTypeWithParameter.f31057f = Optional.of(charset);
        return mediaTypeWithParameter;
    }

    public MediaType withParameter(String str, String str2) {
        return withParameters(str, ImmutableSet.of(str2));
    }

    public MediaType withParameters(Multimap<String, String> multimap) {
        return e(this.f31052a, this.f31053b, multimap);
    }

    public MediaType withoutParameters() {
        return this.f31054c.isEmpty() ? this : create(this.f31052a, this.f31053b);
    }

    public MediaType withParameters(String str, Iterable<String> iterable) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(iterable);
        String strJ = j(str);
        ImmutableListMultimap.Builder builder = ImmutableListMultimap.builder();
        UnmodifiableIterator it = this.f31054c.entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str2 = (String) entry.getKey();
            if (!strJ.equals(str2)) {
                builder.put(str2, (String) entry.getValue());
            }
        }
        Iterator<String> it2 = iterable.iterator();
        while (it2.hasNext()) {
            builder.put(strJ, i(strJ, it2.next()));
        }
        MediaType mediaType = new MediaType(this.f31052a, this.f31053b, builder.build());
        if (!strJ.equals(D5.M)) {
            mediaType.f31057f = this.f31057f;
        }
        return (MediaType) MoreObjects.firstNonNull((MediaType) f31050k.get(mediaType), mediaType);
    }
}
