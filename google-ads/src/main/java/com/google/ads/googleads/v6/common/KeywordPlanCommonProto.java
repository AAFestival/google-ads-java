// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/common/keyword_plan_common.proto

package com.google.ads.googleads.v6.common;

public final class KeywordPlanCommonProto {
  private KeywordPlanCommonProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_common_KeywordPlanHistoricalMetrics_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_common_KeywordPlanHistoricalMetrics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_common_MonthlySearchVolume_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_common_MonthlySearchVolume_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/googleads/v6/common/keyword" +
      "_plan_common.proto\022\036google.ads.googleads" +
      ".v6.common\032Bgoogle/ads/googleads/v6/enum" +
      "s/keyword_plan_competition_level.proto\0321" +
      "google/ads/googleads/v6/enums/month_of_y" +
      "ear.proto\032\034google/api/annotations.proto\"" +
      "\350\003\n\034KeywordPlanHistoricalMetrics\022!\n\024avg_" +
      "monthly_searches\030\007 \001(\003H\000\210\001\001\022S\n\026monthly_s" +
      "earch_volumes\030\006 \003(\01323.google.ads.googlea" +
      "ds.v6.common.MonthlySearchVolume\022o\n\013comp" +
      "etition\030\002 \001(\0162Z.google.ads.googleads.v6." +
      "enums.KeywordPlanCompetitionLevelEnum.Ke" +
      "ywordPlanCompetitionLevel\022\036\n\021competition" +
      "_index\030\010 \001(\003H\001\210\001\001\022\'\n\032low_top_of_page_bid" +
      "_micros\030\t \001(\003H\002\210\001\001\022(\n\033high_top_of_page_b" +
      "id_micros\030\n \001(\003H\003\210\001\001B\027\n\025_avg_monthly_sea" +
      "rchesB\024\n\022_competition_indexB\035\n\033_low_top_" +
      "of_page_bid_microsB\036\n\034_high_top_of_page_" +
      "bid_micros\"\260\001\n\023MonthlySearchVolume\022\021\n\004ye" +
      "ar\030\004 \001(\003H\000\210\001\001\022I\n\005month\030\002 \001(\0162:.google.ad" +
      "s.googleads.v6.enums.MonthOfYearEnum.Mon" +
      "thOfYear\022\035\n\020monthly_searches\030\005 \001(\003H\001\210\001\001B" +
      "\007\n\005_yearB\023\n\021_monthly_searchesB\361\001\n\"com.go" +
      "ogle.ads.googleads.v6.commonB\026KeywordPla" +
      "nCommonProtoP\001ZDgoogle.golang.org/genpro" +
      "to/googleapis/ads/googleads/v6/common;co" +
      "mmon\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V6.Com" +
      "mon\312\002\036Google\\Ads\\GoogleAds\\V6\\Common\352\002\"G" +
      "oogle::Ads::GoogleAds::V6::Commonb\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v6.enums.KeywordPlanCompetitionLevelProto.getDescriptor(),
          com.google.ads.googleads.v6.enums.MonthOfYearProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v6_common_KeywordPlanHistoricalMetrics_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v6_common_KeywordPlanHistoricalMetrics_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_common_KeywordPlanHistoricalMetrics_descriptor,
        new java.lang.String[] { "AvgMonthlySearches", "MonthlySearchVolumes", "Competition", "CompetitionIndex", "LowTopOfPageBidMicros", "HighTopOfPageBidMicros", "AvgMonthlySearches", "CompetitionIndex", "LowTopOfPageBidMicros", "HighTopOfPageBidMicros", });
    internal_static_google_ads_googleads_v6_common_MonthlySearchVolume_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v6_common_MonthlySearchVolume_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_common_MonthlySearchVolume_descriptor,
        new java.lang.String[] { "Year", "Month", "MonthlySearches", "Year", "MonthlySearches", });
    com.google.ads.googleads.v6.enums.KeywordPlanCompetitionLevelProto.getDescriptor();
    com.google.ads.googleads.v6.enums.MonthOfYearProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
