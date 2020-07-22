// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/resources/campaign.proto

package com.google.ads.googleads.v4.resources;

public final class CampaignProto {
  private CampaignProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_resources_Campaign_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_resources_Campaign_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_resources_Campaign_NetworkSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_resources_Campaign_NetworkSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_resources_Campaign_HotelSettingInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_resources_Campaign_HotelSettingInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_resources_Campaign_OptimizationGoalSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_resources_Campaign_OptimizationGoalSetting_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_resources_Campaign_DynamicSearchAdsSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_resources_Campaign_DynamicSearchAdsSetting_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_resources_Campaign_LocalCampaignSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_resources_Campaign_LocalCampaignSetting_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_resources_Campaign_ShoppingSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_resources_Campaign_ShoppingSetting_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_resources_Campaign_TrackingSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_resources_Campaign_TrackingSetting_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_resources_Campaign_GeoTargetTypeSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_resources_Campaign_GeoTargetTypeSetting_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_resources_Campaign_VanityPharma_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_resources_Campaign_VanityPharma_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_resources_Campaign_AppCampaignSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_resources_Campaign_AppCampaignSetting_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_resources_Campaign_SelectiveOptimization_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_resources_Campaign_SelectiveOptimization_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0google/ads/googleads/v4/resources/camp" +
      "aign.proto\022!google.ads.googleads.v4.reso" +
      "urces\032,google/ads/googleads/v4/common/bi" +
      "dding.proto\0325google/ads/googleads/v4/com" +
      "mon/custom_parameter.proto\0322google/ads/g" +
      "oogleads/v4/common/frequency_cap.proto\032>" +
      "google/ads/googleads/v4/common/real_time" +
      "_bidding_setting.proto\0326google/ads/googl" +
      "eads/v4/common/targeting_setting.proto\032B" +
      "google/ads/googleads/v4/enums/ad_serving" +
      "_optimization_status.proto\032@google/ads/g" +
      "oogleads/v4/enums/advertising_channel_su" +
      "b_type.proto\032<google/ads/googleads/v4/en" +
      "ums/advertising_channel_type.proto\032:goog" +
      "le/ads/googleads/v4/enums/app_campaign_a" +
      "pp_store.proto\032Kgoogle/ads/googleads/v4/" +
      "enums/app_campaign_bidding_strategy_goal" +
      "_type.proto\0329google/ads/googleads/v4/enu" +
      "ms/bidding_strategy_type.proto\032<google/a" +
      "ds/googleads/v4/enums/brand_safety_suita" +
      "bility.proto\032<google/ads/googleads/v4/en" +
      "ums/campaign_experiment_type.proto\032;goog" +
      "le/ads/googleads/v4/enums/campaign_servi" +
      "ng_status.proto\0323google/ads/googleads/v4" +
      "/enums/campaign_status.proto\0328google/ads" +
      "/googleads/v4/enums/location_source_type" +
      ".proto\032<google/ads/googleads/v4/enums/ne" +
      "gative_geo_target_type.proto\032:google/ads" +
      "/googleads/v4/enums/optimization_goal_ty" +
      "pe.proto\0320google/ads/googleads/v4/enums/" +
      "payment_mode.proto\032<google/ads/googleads" +
      "/v4/enums/positive_geo_target_type.proto" +
      "\032Bgoogle/ads/googleads/v4/enums/vanity_p" +
      "harma_display_url_mode.proto\0326google/ads" +
      "/googleads/v4/enums/vanity_pharma_text.p" +
      "roto\032\037google/api/field_behavior.proto\032\031g" +
      "oogle/api/resource.proto\032\036google/protobu" +
      "f/wrappers.proto\032\034google/api/annotations" +
      ".proto\"\3021\n\010Campaign\022@\n\rresource_name\030\001 \001" +
      "(\tB)\340A\005\372A#\n!googleads.googleapis.com/Cam" +
      "paign\022,\n\002id\030\003 \001(\0132\033.google.protobuf.Int6" +
      "4ValueB\003\340A\003\022*\n\004name\030\004 \001(\0132\034.google.proto" +
      "buf.StringValue\022P\n\006status\030\005 \001(\0162@.google" +
      ".ads.googleads.v4.enums.CampaignStatusEn" +
      "um.CampaignStatus\022k\n\016serving_status\030\025 \001(" +
      "\0162N.google.ads.googleads.v4.enums.Campai" +
      "gnServingStatusEnum.CampaignServingStatu" +
      "sB\003\340A\003\022\202\001\n\036ad_serving_optimization_statu" +
      "s\030\010 \001(\0162Z.google.ads.googleads.v4.enums." +
      "AdServingOptimizationStatusEnum.AdServin" +
      "gOptimizationStatus\022w\n\030advertising_chann" +
      "el_type\030\t \001(\0162P.google.ads.googleads.v4." +
      "enums.AdvertisingChannelTypeEnum.Adverti" +
      "singChannelTypeB\003\340A\005\022\201\001\n\034advertising_cha" +
      "nnel_sub_type\030\n \001(\0162V.google.ads.googlea" +
      "ds.v4.enums.AdvertisingChannelSubTypeEnu" +
      "m.AdvertisingChannelSubTypeB\003\340A\005\022;\n\025trac" +
      "king_url_template\030\013 \001(\0132\034.google.protobu" +
      "f.StringValue\022N\n\025url_custom_parameters\030\014" +
      " \003(\0132/.google.ads.googleads.v4.common.Cu" +
      "stomParameter\022Y\n\031real_time_bidding_setti" +
      "ng\030\' \001(\01326.google.ads.googleads.v4.commo" +
      "n.RealTimeBiddingSetting\022U\n\020network_sett" +
      "ings\030\016 \001(\0132;.google.ads.googleads.v4.res" +
      "ources.Campaign.NetworkSettings\022X\n\rhotel" +
      "_setting\030  \001(\0132<.google.ads.googleads.v4" +
      ".resources.Campaign.HotelSettingInfoB\003\340A" +
      "\005\022g\n\032dynamic_search_ads_setting\030! \001(\0132C." +
      "google.ads.googleads.v4.resources.Campai" +
      "gn.DynamicSearchAdsSetting\022U\n\020shopping_s" +
      "etting\030$ \001(\0132;.google.ads.googleads.v4.r" +
      "esources.Campaign.ShoppingSetting\022K\n\021tar" +
      "geting_setting\030+ \001(\01320.google.ads.google" +
      "ads.v4.common.TargetingSetting\022a\n\027geo_ta" +
      "rget_type_setting\030/ \001(\0132@.google.ads.goo" +
      "gleads.v4.resources.Campaign.GeoTargetTy" +
      "peSetting\022`\n\026local_campaign_setting\0302 \001(" +
      "\0132@.google.ads.googleads.v4.resources.Ca" +
      "mpaign.LocalCampaignSetting\022\\\n\024app_campa" +
      "ign_setting\0303 \001(\0132>.google.ads.googleads" +
      ".v4.resources.Campaign.AppCampaignSettin" +
      "g\022\\\n\006labels\0305 \003(\0132\034.google.protobuf.Stri" +
      "ngValueB.\340A\003\372A(\n&googleads.googleapis.co" +
      "m/CampaignLabel\022n\n\017experiment_type\030\021 \001(\016" +
      "2P.google.ads.googleads.v4.enums.Campaig" +
      "nExperimentTypeEnum.CampaignExperimentTy" +
      "peB\003\340A\003\022^\n\rbase_campaign\030\034 \001(\0132\034.google." +
      "protobuf.StringValueB)\340A\003\372A#\n!googleads." +
      "googleapis.com/Campaign\022c\n\017campaign_budg" +
      "et\030\006 \001(\0132\034.google.protobuf.StringValueB," +
      "\372A)\n\'googleads.googleapis.com/CampaignBu" +
      "dget\022n\n\025bidding_strategy_type\030\026 \001(\0162J.go" +
      "ogle.ads.googleads.v4.enums.BiddingStrat" +
      "egyTypeEnum.BiddingStrategyTypeB\003\340A\003\0220\n\n" +
      "start_date\030\023 \001(\0132\034.google.protobuf.Strin" +
      "gValue\022.\n\010end_date\030\024 \001(\0132\034.google.protob" +
      "uf.StringValue\0226\n\020final_url_suffix\030& \001(\013" +
      "2\034.google.protobuf.StringValue\022I\n\016freque" +
      "ncy_caps\030( \003(\01321.google.ads.googleads.v4" +
      ".common.FrequencyCapEntry\022}\n\036video_brand" +
      "_safety_suitability\030* \001(\0162P.google.ads.g" +
      "oogleads.v4.enums.BrandSafetySuitability" +
      "Enum.BrandSafetySuitabilityB\003\340A\003\022O\n\rvani" +
      "ty_pharma\030, \001(\01328.google.ads.googleads.v" +
      "4.resources.Campaign.VanityPharma\022a\n\026sel" +
      "ective_optimization\030- \001(\0132A.google.ads.g" +
      "oogleads.v4.resources.Campaign.Selective" +
      "Optimization\022f\n\031optimization_goal_settin" +
      "g\0306 \001(\0132C.google.ads.googleads.v4.resour" +
      "ces.Campaign.OptimizationGoalSetting\022Z\n\020" +
      "tracking_setting\030. \001(\0132;.google.ads.goog" +
      "leads.v4.resources.Campaign.TrackingSett" +
      "ingB\003\340A\003\022P\n\014payment_mode\0304 \001(\0162:.google." +
      "ads.googleads.v4.enums.PaymentModeEnum.P" +
      "aymentMode\022=\n\022optimization_score\0307 \001(\0132\034" +
      ".google.protobuf.DoubleValueB\003\340A\003\022g\n\020bid" +
      "ding_strategy\030\027 \001(\0132\034.google.protobuf.St" +
      "ringValueB-\372A*\n(googleads.googleapis.com" +
      "/BiddingStrategyH\000\022@\n\ncommission\0301 \001(\0132*" +
      ".google.ads.googleads.v4.common.Commissi" +
      "onH\000\022?\n\nmanual_cpc\030\030 \001(\0132).google.ads.go" +
      "ogleads.v4.common.ManualCpcH\000\022?\n\nmanual_" +
      "cpm\030\031 \001(\0132).google.ads.googleads.v4.comm" +
      "on.ManualCpmH\000\022D\n\nmanual_cpv\030% \001(\0132).goo" +
      "gle.ads.googleads.v4.common.ManualCpvB\003\340" +
      "A\003H\000\022S\n\024maximize_conversions\030\036 \001(\01323.goo" +
      "gle.ads.googleads.v4.common.MaximizeConv" +
      "ersionsH\000\022\\\n\031maximize_conversion_value\030\037" +
      " \001(\01327.google.ads.googleads.v4.common.Ma" +
      "ximizeConversionValueH\000\022?\n\ntarget_cpa\030\032 " +
      "\001(\0132).google.ads.googleads.v4.common.Tar" +
      "getCpaH\000\022X\n\027target_impression_share\0300 \001(" +
      "\01325.google.ads.googleads.v4.common.Targe" +
      "tImpressionShareH\000\022A\n\013target_roas\030\035 \001(\0132" +
      "*.google.ads.googleads.v4.common.TargetR" +
      "oasH\000\022C\n\014target_spend\030\033 \001(\0132+.google.ads" +
      ".googleads.v4.common.TargetSpendH\000\022A\n\013pe" +
      "rcent_cpc\030\" \001(\0132*.google.ads.googleads.v" +
      "4.common.PercentCpcH\000\022?\n\ntarget_cpm\030) \001(" +
      "\0132).google.ads.googleads.v4.common.Targe" +
      "tCpmH\000\032\205\002\n\017NetworkSettings\0228\n\024target_goo" +
      "gle_search\030\001 \001(\0132\032.google.protobuf.BoolV" +
      "alue\0229\n\025target_search_network\030\002 \001(\0132\032.go" +
      "ogle.protobuf.BoolValue\022:\n\026target_conten" +
      "t_network\030\003 \001(\0132\032.google.protobuf.BoolVa" +
      "lue\022A\n\035target_partner_search_network\030\004 \001" +
      "(\0132\032.google.protobuf.BoolValue\032M\n\020HotelS" +
      "ettingInfo\0229\n\017hotel_center_id\030\001 \001(\0132\033.go" +
      "ogle.protobuf.Int64ValueB\003\340A\005\032\210\001\n\027Optimi" +
      "zationGoalSetting\022m\n\027optimization_goal_t" +
      "ypes\030\001 \003(\0162L.google.ads.googleads.v4.enu" +
      "ms.OptimizationGoalTypeEnum.Optimization" +
      "GoalType\032\221\002\n\027DynamicSearchAdsSetting\0221\n\013" +
      "domain_name\030\001 \001(\0132\034.google.protobuf.Stri" +
      "ngValue\0223\n\rlanguage_code\030\002 \001(\0132\034.google." +
      "protobuf.StringValue\022:\n\026use_supplied_url" +
      "s_only\030\003 \001(\0132\032.google.protobuf.BoolValue" +
      "\022R\n\005feeds\030\005 \003(\0132\034.google.protobuf.String" +
      "ValueB%\340A\003\372A\037\n\035googleads.googleapis.com/" +
      "Feed\032~\n\024LocalCampaignSetting\022f\n\024location" +
      "_source_type\030\001 \001(\0162H.google.ads.googlead" +
      "s.v4.enums.LocationSourceTypeEnum.Locati" +
      "onSourceType\032\354\001\n\017ShoppingSetting\0225\n\013merc" +
      "hant_id\030\001 \001(\0132\033.google.protobuf.Int64Val" +
      "ueB\003\340A\005\0228\n\rsales_country\030\002 \001(\0132\034.google." +
      "protobuf.StringValueB\003\340A\005\0226\n\021campaign_pr" +
      "iority\030\003 \001(\0132\033.google.protobuf.Int32Valu" +
      "e\0220\n\014enable_local\030\004 \001(\0132\032.google.protobu" +
      "f.BoolValue\032J\n\017TrackingSetting\0227\n\014tracki" +
      "ng_url\030\001 \001(\0132\034.google.protobuf.StringVal" +
      "ueB\003\340A\003\032\372\001\n\024GeoTargetTypeSetting\022p\n\030posi" +
      "tive_geo_target_type\030\001 \001(\0162N.google.ads." +
      "googleads.v4.enums.PositiveGeoTargetType" +
      "Enum.PositiveGeoTargetType\022p\n\030negative_g" +
      "eo_target_type\030\002 \001(\0162N.google.ads.google" +
      "ads.v4.enums.NegativeGeoTargetTypeEnum.N" +
      "egativeGeoTargetType\032\363\001\n\014VanityPharma\022\200\001" +
      "\n\036vanity_pharma_display_url_mode\030\001 \001(\0162X" +
      ".google.ads.googleads.v4.enums.VanityPha" +
      "rmaDisplayUrlModeEnum.VanityPharmaDispla" +
      "yUrlMode\022`\n\022vanity_pharma_text\030\002 \001(\0162D.g" +
      "oogle.ads.googleads.v4.enums.VanityPharm" +
      "aTextEnum.VanityPharmaText\032\272\002\n\022AppCampai" +
      "gnSetting\022\214\001\n\032bidding_strategy_goal_type" +
      "\030\001 \001(\0162h.google.ads.googleads.v4.enums.A" +
      "ppCampaignBiddingStrategyGoalTypeEnum.Ap" +
      "pCampaignBiddingStrategyGoalType\0221\n\006app_" +
      "id\030\002 \001(\0132\034.google.protobuf.StringValueB\003" +
      "\340A\005\022b\n\tapp_store\030\003 \001(\0162J.google.ads.goog" +
      "leads.v4.enums.AppCampaignAppStoreEnum.A" +
      "ppCampaignAppStoreB\003\340A\005\032\201\001\n\025SelectiveOpt" +
      "imization\022h\n\022conversion_actions\030\001 \003(\0132\034." +
      "google.protobuf.StringValueB.\372A+\n)google" +
      "ads.googleapis.com/ConversionAction:Q\352AN" +
      "\n!googleads.googleapis.com/Campaign\022)cus" +
      "tomers/{customer}/campaigns/{campaign}B\033" +
      "\n\031campaign_bidding_strategyB\372\001\n%com.goog" +
      "le.ads.googleads.v4.resourcesB\rCampaignP" +
      "rotoP\001ZJgoogle.golang.org/genproto/googl" +
      "eapis/ads/googleads/v4/resources;resourc" +
      "es\242\002\003GAA\252\002!Google.Ads.GoogleAds.V4.Resou" +
      "rces\312\002!Google\\Ads\\GoogleAds\\V4\\Resources" +
      "\352\002%Google::Ads::GoogleAds::V4::Resources" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v4.common.BiddingProto.getDescriptor(),
          com.google.ads.googleads.v4.common.CustomParameterProto.getDescriptor(),
          com.google.ads.googleads.v4.common.FrequencyCapProto.getDescriptor(),
          com.google.ads.googleads.v4.common.RealTimeBiddingSettingProto.getDescriptor(),
          com.google.ads.googleads.v4.common.TargetingSettingProto.getDescriptor(),
          com.google.ads.googleads.v4.enums.AdServingOptimizationStatusProto.getDescriptor(),
          com.google.ads.googleads.v4.enums.AdvertisingChannelSubTypeProto.getDescriptor(),
          com.google.ads.googleads.v4.enums.AdvertisingChannelTypeProto.getDescriptor(),
          com.google.ads.googleads.v4.enums.AppCampaignAppStoreProto.getDescriptor(),
          com.google.ads.googleads.v4.enums.AppCampaignBiddingStrategyGoalTypeProto.getDescriptor(),
          com.google.ads.googleads.v4.enums.BiddingStrategyTypeProto.getDescriptor(),
          com.google.ads.googleads.v4.enums.BrandSafetySuitabilityProto.getDescriptor(),
          com.google.ads.googleads.v4.enums.CampaignExperimentTypeProto.getDescriptor(),
          com.google.ads.googleads.v4.enums.CampaignServingStatusProto.getDescriptor(),
          com.google.ads.googleads.v4.enums.CampaignStatusProto.getDescriptor(),
          com.google.ads.googleads.v4.enums.LocationSourceTypeProto.getDescriptor(),
          com.google.ads.googleads.v4.enums.NegativeGeoTargetTypeProto.getDescriptor(),
          com.google.ads.googleads.v4.enums.OptimizationGoalTypeProto.getDescriptor(),
          com.google.ads.googleads.v4.enums.PaymentModeProto.getDescriptor(),
          com.google.ads.googleads.v4.enums.PositiveGeoTargetTypeProto.getDescriptor(),
          com.google.ads.googleads.v4.enums.VanityPharmaDisplayUrlModeProto.getDescriptor(),
          com.google.ads.googleads.v4.enums.VanityPharmaTextProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v4_resources_Campaign_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v4_resources_Campaign_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_resources_Campaign_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "Status", "ServingStatus", "AdServingOptimizationStatus", "AdvertisingChannelType", "AdvertisingChannelSubType", "TrackingUrlTemplate", "UrlCustomParameters", "RealTimeBiddingSetting", "NetworkSettings", "HotelSetting", "DynamicSearchAdsSetting", "ShoppingSetting", "TargetingSetting", "GeoTargetTypeSetting", "LocalCampaignSetting", "AppCampaignSetting", "Labels", "ExperimentType", "BaseCampaign", "CampaignBudget", "BiddingStrategyType", "StartDate", "EndDate", "FinalUrlSuffix", "FrequencyCaps", "VideoBrandSafetySuitability", "VanityPharma", "SelectiveOptimization", "OptimizationGoalSetting", "TrackingSetting", "PaymentMode", "OptimizationScore", "BiddingStrategy", "Commission", "ManualCpc", "ManualCpm", "ManualCpv", "MaximizeConversions", "MaximizeConversionValue", "TargetCpa", "TargetImpressionShare", "TargetRoas", "TargetSpend", "PercentCpc", "TargetCpm", "CampaignBiddingStrategy", });
    internal_static_google_ads_googleads_v4_resources_Campaign_NetworkSettings_descriptor =
      internal_static_google_ads_googleads_v4_resources_Campaign_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v4_resources_Campaign_NetworkSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_resources_Campaign_NetworkSettings_descriptor,
        new java.lang.String[] { "TargetGoogleSearch", "TargetSearchNetwork", "TargetContentNetwork", "TargetPartnerSearchNetwork", });
    internal_static_google_ads_googleads_v4_resources_Campaign_HotelSettingInfo_descriptor =
      internal_static_google_ads_googleads_v4_resources_Campaign_descriptor.getNestedTypes().get(1);
    internal_static_google_ads_googleads_v4_resources_Campaign_HotelSettingInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_resources_Campaign_HotelSettingInfo_descriptor,
        new java.lang.String[] { "HotelCenterId", });
    internal_static_google_ads_googleads_v4_resources_Campaign_OptimizationGoalSetting_descriptor =
      internal_static_google_ads_googleads_v4_resources_Campaign_descriptor.getNestedTypes().get(2);
    internal_static_google_ads_googleads_v4_resources_Campaign_OptimizationGoalSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_resources_Campaign_OptimizationGoalSetting_descriptor,
        new java.lang.String[] { "OptimizationGoalTypes", });
    internal_static_google_ads_googleads_v4_resources_Campaign_DynamicSearchAdsSetting_descriptor =
      internal_static_google_ads_googleads_v4_resources_Campaign_descriptor.getNestedTypes().get(3);
    internal_static_google_ads_googleads_v4_resources_Campaign_DynamicSearchAdsSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_resources_Campaign_DynamicSearchAdsSetting_descriptor,
        new java.lang.String[] { "DomainName", "LanguageCode", "UseSuppliedUrlsOnly", "Feeds", });
    internal_static_google_ads_googleads_v4_resources_Campaign_LocalCampaignSetting_descriptor =
      internal_static_google_ads_googleads_v4_resources_Campaign_descriptor.getNestedTypes().get(4);
    internal_static_google_ads_googleads_v4_resources_Campaign_LocalCampaignSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_resources_Campaign_LocalCampaignSetting_descriptor,
        new java.lang.String[] { "LocationSourceType", });
    internal_static_google_ads_googleads_v4_resources_Campaign_ShoppingSetting_descriptor =
      internal_static_google_ads_googleads_v4_resources_Campaign_descriptor.getNestedTypes().get(5);
    internal_static_google_ads_googleads_v4_resources_Campaign_ShoppingSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_resources_Campaign_ShoppingSetting_descriptor,
        new java.lang.String[] { "MerchantId", "SalesCountry", "CampaignPriority", "EnableLocal", });
    internal_static_google_ads_googleads_v4_resources_Campaign_TrackingSetting_descriptor =
      internal_static_google_ads_googleads_v4_resources_Campaign_descriptor.getNestedTypes().get(6);
    internal_static_google_ads_googleads_v4_resources_Campaign_TrackingSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_resources_Campaign_TrackingSetting_descriptor,
        new java.lang.String[] { "TrackingUrl", });
    internal_static_google_ads_googleads_v4_resources_Campaign_GeoTargetTypeSetting_descriptor =
      internal_static_google_ads_googleads_v4_resources_Campaign_descriptor.getNestedTypes().get(7);
    internal_static_google_ads_googleads_v4_resources_Campaign_GeoTargetTypeSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_resources_Campaign_GeoTargetTypeSetting_descriptor,
        new java.lang.String[] { "PositiveGeoTargetType", "NegativeGeoTargetType", });
    internal_static_google_ads_googleads_v4_resources_Campaign_VanityPharma_descriptor =
      internal_static_google_ads_googleads_v4_resources_Campaign_descriptor.getNestedTypes().get(8);
    internal_static_google_ads_googleads_v4_resources_Campaign_VanityPharma_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_resources_Campaign_VanityPharma_descriptor,
        new java.lang.String[] { "VanityPharmaDisplayUrlMode", "VanityPharmaText", });
    internal_static_google_ads_googleads_v4_resources_Campaign_AppCampaignSetting_descriptor =
      internal_static_google_ads_googleads_v4_resources_Campaign_descriptor.getNestedTypes().get(9);
    internal_static_google_ads_googleads_v4_resources_Campaign_AppCampaignSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_resources_Campaign_AppCampaignSetting_descriptor,
        new java.lang.String[] { "BiddingStrategyGoalType", "AppId", "AppStore", });
    internal_static_google_ads_googleads_v4_resources_Campaign_SelectiveOptimization_descriptor =
      internal_static_google_ads_googleads_v4_resources_Campaign_descriptor.getNestedTypes().get(10);
    internal_static_google_ads_googleads_v4_resources_Campaign_SelectiveOptimization_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_resources_Campaign_SelectiveOptimization_descriptor,
        new java.lang.String[] { "ConversionActions", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v4.common.BiddingProto.getDescriptor();
    com.google.ads.googleads.v4.common.CustomParameterProto.getDescriptor();
    com.google.ads.googleads.v4.common.FrequencyCapProto.getDescriptor();
    com.google.ads.googleads.v4.common.RealTimeBiddingSettingProto.getDescriptor();
    com.google.ads.googleads.v4.common.TargetingSettingProto.getDescriptor();
    com.google.ads.googleads.v4.enums.AdServingOptimizationStatusProto.getDescriptor();
    com.google.ads.googleads.v4.enums.AdvertisingChannelSubTypeProto.getDescriptor();
    com.google.ads.googleads.v4.enums.AdvertisingChannelTypeProto.getDescriptor();
    com.google.ads.googleads.v4.enums.AppCampaignAppStoreProto.getDescriptor();
    com.google.ads.googleads.v4.enums.AppCampaignBiddingStrategyGoalTypeProto.getDescriptor();
    com.google.ads.googleads.v4.enums.BiddingStrategyTypeProto.getDescriptor();
    com.google.ads.googleads.v4.enums.BrandSafetySuitabilityProto.getDescriptor();
    com.google.ads.googleads.v4.enums.CampaignExperimentTypeProto.getDescriptor();
    com.google.ads.googleads.v4.enums.CampaignServingStatusProto.getDescriptor();
    com.google.ads.googleads.v4.enums.CampaignStatusProto.getDescriptor();
    com.google.ads.googleads.v4.enums.LocationSourceTypeProto.getDescriptor();
    com.google.ads.googleads.v4.enums.NegativeGeoTargetTypeProto.getDescriptor();
    com.google.ads.googleads.v4.enums.OptimizationGoalTypeProto.getDescriptor();
    com.google.ads.googleads.v4.enums.PaymentModeProto.getDescriptor();
    com.google.ads.googleads.v4.enums.PositiveGeoTargetTypeProto.getDescriptor();
    com.google.ads.googleads.v4.enums.VanityPharmaDisplayUrlModeProto.getDescriptor();
    com.google.ads.googleads.v4.enums.VanityPharmaTextProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}