package net.pubnative.lite.sdk.utils.svgparser.utils;

import java.io.InputStream;
import net.pubnative.lite.sdk.utils.svgparser.SVGExternalFileResolver;

/* JADX INFO: loaded from: classes3.dex */
interface SVGParser {
    SVGBase parseStream(InputStream inputStream);

    SVGParser setExternalFileResolver(SVGExternalFileResolver sVGExternalFileResolver);

    SVGParser setInternalEntitiesEnabled(boolean z10);
}
