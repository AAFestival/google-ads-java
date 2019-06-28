// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/keyword_plan_campaign_service.proto

package com.google.ads.googleads.v1.services;

public final class KeywordPlanCampaignServiceProto {
  private KeywordPlanCampaignServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_GetKeywordPlanCampaignRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_GetKeywordPlanCampaignRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateKeywordPlanCampaignsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateKeywordPlanCampaignsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_KeywordPlanCampaignOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_KeywordPlanCampaignOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateKeywordPlanCampaignsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateKeywordPlanCampaignsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateKeywordPlanCampaignResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateKeywordPlanCampaignResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nDgoogle/ads/googleads/v1/services/keywo" +
      "rd_plan_campaign_service.proto\022 google.a" +
      "ds.googleads.v1.services\032=google/ads/goo" +
      "gleads/v1/resources/keyword_plan_campaig" +
      "n.proto\032\034google/api/annotations.proto\032 g" +
      "oogle/protobuf/field_mask.proto\032\036google/" +
      "protobuf/wrappers.proto\032\027google/rpc/stat" +
      "us.proto\"6\n\035GetKeywordPlanCampaignReques" +
      "t\022\025\n\rresource_name\030\001 \001(\t\"\274\001\n!MutateKeywo" +
      "rdPlanCampaignsRequest\022\023\n\013customer_id\030\001 " +
      "\001(\t\022R\n\noperations\030\002 \003(\0132>.google.ads.goo" +
      "gleads.v1.services.KeywordPlanCampaignOp" +
      "eration\022\027\n\017partial_failure\030\003 \001(\010\022\025\n\rvali" +
      "date_only\030\004 \001(\010\"\202\002\n\034KeywordPlanCampaignO" +
      "peration\022/\n\013update_mask\030\004 \001(\0132\032.google.p" +
      "rotobuf.FieldMask\022H\n\006create\030\001 \001(\01326.goog" +
      "le.ads.googleads.v1.resources.KeywordPla" +
      "nCampaignH\000\022H\n\006update\030\002 \001(\01326.google.ads" +
      ".googleads.v1.resources.KeywordPlanCampa" +
      "ignH\000\022\020\n\006remove\030\003 \001(\tH\000B\013\n\toperation\"\253\001\n" +
      "\"MutateKeywordPlanCampaignsResponse\0221\n\025p" +
      "artial_failure_error\030\003 \001(\0132\022.google.rpc." +
      "Status\022R\n\007results\030\002 \003(\0132A.google.ads.goo" +
      "gleads.v1.services.MutateKeywordPlanCamp" +
      "aignResult\"8\n\037MutateKeywordPlanCampaignR" +
      "esult\022\025\n\rresource_name\030\001 \001(\t2\340\003\n\032Keyword" +
      "PlanCampaignService\022\321\001\n\026GetKeywordPlanCa" +
      "mpaign\022?.google.ads.googleads.v1.service" +
      "s.GetKeywordPlanCampaignRequest\0326.google" +
      ".ads.googleads.v1.resources.KeywordPlanC" +
      "ampaign\">\202\323\344\223\0028\0226/v1/{resource_name=cust" +
      "omers/*/keywordPlanCampaigns/*}\022\355\001\n\032Muta" +
      "teKeywordPlanCampaigns\022C.google.ads.goog" +
      "leads.v1.services.MutateKeywordPlanCampa" +
      "ignsRequest\032D.google.ads.googleads.v1.se" +
      "rvices.MutateKeywordPlanCampaignsRespons" +
      "e\"D\202\323\344\223\002>\"9/v1/customers/{customer_id=*}" +
      "/keywordPlanCampaigns:mutate:\001*B\206\002\n$com." +
      "google.ads.googleads.v1.servicesB\037Keywor" +
      "dPlanCampaignServiceProtoP\001ZHgoogle.gola" +
      "ng.org/genproto/googleapis/ads/googleads" +
      "/v1/services;services\242\002\003GAA\252\002 Google.Ads" +
      ".GoogleAds.V1.Services\312\002 Google\\Ads\\Goog" +
      "leAds\\V1\\Services\352\002$Google::Ads::GoogleA" +
      "ds::V1::Servicesb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v1.resources.KeywordPlanCampaignProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_services_GetKeywordPlanCampaignRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_services_GetKeywordPlanCampaignRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_GetKeywordPlanCampaignRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v1_services_MutateKeywordPlanCampaignsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v1_services_MutateKeywordPlanCampaignsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateKeywordPlanCampaignsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v1_services_KeywordPlanCampaignOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v1_services_KeywordPlanCampaignOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_KeywordPlanCampaignOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v1_services_MutateKeywordPlanCampaignsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v1_services_MutateKeywordPlanCampaignsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateKeywordPlanCampaignsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v1_services_MutateKeywordPlanCampaignResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v1_services_MutateKeywordPlanCampaignResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateKeywordPlanCampaignResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v1.resources.KeywordPlanCampaignProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
