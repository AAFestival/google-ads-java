// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/services/offline_user_data_job_service.proto

package com.google.ads.googleads.v6.services;

public final class OfflineUserDataJobServiceProto {
  private OfflineUserDataJobServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_googleads_v6_services_CreateOfflineUserDataJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_CreateOfflineUserDataJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_googleads_v6_services_CreateOfflineUserDataJobResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_CreateOfflineUserDataJobResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_googleads_v6_services_GetOfflineUserDataJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_GetOfflineUserDataJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_googleads_v6_services_RunOfflineUserDataJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_RunOfflineUserDataJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_googleads_v6_services_AddOfflineUserDataJobOperationsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_AddOfflineUserDataJobOperationsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_googleads_v6_services_OfflineUserDataJobOperation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_OfflineUserDataJobOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_googleads_v6_services_AddOfflineUserDataJobOperationsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_AddOfflineUserDataJobOperationsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nDgoogle/ads/googleads/v6/services/offli"
          + "ne_user_data_job_service.proto\022 google.a"
          + "ds.googleads.v6.services\0326google/ads/goo"
          + "gleads/v6/common/offline_user_data.proto"
          + "\032=google/ads/googleads/v6/resources/offl"
          + "ine_user_data_job.proto\032\034google/api/anno"
          + "tations.proto\032\027google/api/client.proto\032\037"
          + "google/api/field_behavior.proto\032\031google/"
          + "api/resource.proto\032#google/longrunning/o"
          + "perations.proto\032\027google/rpc/status.proto"
          + "\"\204\001\n\037CreateOfflineUserDataJobRequest\022\030\n\013"
          + "customer_id\030\001 \001(\tB\003\340A\002\022G\n\003job\030\002 \001(\01325.go"
          + "ogle.ads.googleads.v6.resources.OfflineU"
          + "serDataJobB\003\340A\002\"9\n CreateOfflineUserData"
          + "JobResponse\022\025\n\rresource_name\030\001 \001(\t\"j\n\034Ge"
          + "tOfflineUserDataJobRequest\022J\n\rresource_n"
          + "ame\030\001 \001(\tB3\340A\002\372A-\n+googleads.googleapis."
          + "com/OfflineUserDataJob\"j\n\034RunOfflineUser"
          + "DataJobRequest\022J\n\rresource_name\030\001 \001(\tB3\340"
          + "A\002\372A-\n+googleads.googleapis.com/OfflineU"
          + "serDataJob\"\214\002\n&AddOfflineUserDataJobOper"
          + "ationsRequest\022J\n\rresource_name\030\001 \001(\tB3\340A"
          + "\002\372A-\n+googleads.googleapis.com/OfflineUs"
          + "erDataJob\022#\n\026enable_partial_failure\030\004 \001("
          + "\010H\000\210\001\001\022V\n\noperations\030\003 \003(\0132=.google.ads."
          + "googleads.v6.services.OfflineUserDataJob"
          + "OperationB\003\340A\002B\031\n\027_enable_partial_failur"
          + "e\"\270\001\n\033OfflineUserDataJobOperation\022:\n\006cre"
          + "ate\030\001 \001(\0132(.google.ads.googleads.v6.comm"
          + "on.UserDataH\000\022:\n\006remove\030\002 \001(\0132(.google.a"
          + "ds.googleads.v6.common.UserDataH\000\022\024\n\nrem"
          + "ove_all\030\003 \001(\010H\000B\013\n\toperation\"\\\n\'AddOffli"
          + "neUserDataJobOperationsResponse\0221\n\025parti"
          + "al_failure_error\030\001 \001(\0132\022.google.rpc.Stat"
          + "us2\342\010\n\031OfflineUserDataJobService\022\370\001\n\030Cre"
          + "ateOfflineUserDataJob\022A.google.ads.googl"
          + "eads.v6.services.CreateOfflineUserDataJo"
          + "bRequest\032B.google.ads.googleads.v6.servi"
          + "ces.CreateOfflineUserDataJobResponse\"U\202\323"
          + "\344\223\002=\"8/v6/customers/{customer_id=*}/offl"
          + "ineUserDataJobs:create:\001*\332A\017customer_id,"
          + "job\022\335\001\n\025GetOfflineUserDataJob\022>.google.a"
          + "ds.googleads.v6.services.GetOfflineUserD"
          + "ataJobRequest\0325.google.ads.googleads.v6."
          + "resources.OfflineUserDataJob\"M\202\323\344\223\0027\0225/v"
          + "6/{resource_name=customers/*/offlineUser"
          + "DataJobs/*}\332A\rresource_name\022\241\002\n\037AddOffli"
          + "neUserDataJobOperations\022H.google.ads.goo"
          + "gleads.v6.services.AddOfflineUserDataJob"
          + "OperationsRequest\032I.google.ads.googleads"
          + ".v6.services.AddOfflineUserDataJobOperat"
          + "ionsResponse\"i\202\323\344\223\002H\"C/v6/{resource_name"
          + "=customers/*/offlineUserDataJobs/*}:addO"
          + "perations:\001*\332A\030resource_name,operations\022"
          + "\376\001\n\025RunOfflineUserDataJob\022>.google.ads.g"
          + "oogleads.v6.services.RunOfflineUserDataJ"
          + "obRequest\032\035.google.longrunning.Operation"
          + "\"\205\001\202\323\344\223\002>\"9/v6/{resource_name=customers/"
          + "*/offlineUserDataJobs/*}:run:\001*\332A\rresour"
          + "ce_name\312A.\n\025google.protobuf.Empty\022\025googl"
          + "e.protobuf.Empty\032E\312A\030googleads.googleapi"
          + "s.com\322A\'https://www.googleapis.com/auth/"
          + "adwordsB\205\002\n$com.google.ads.googleads.v6."
          + "servicesB\036OfflineUserDataJobServiceProto"
          + "P\001ZHgoogle.golang.org/genproto/googleapi"
          + "s/ads/googleads/v6/services;services\242\002\003G"
          + "AA\252\002 Google.Ads.GoogleAds.V6.Services\312\002 "
          + "Google\\Ads\\GoogleAds\\V6\\Services\352\002$Googl"
          + "e::Ads::GoogleAds::V6::Servicesb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.ads.googleads.v6.common.OfflineUserDataProto.getDescriptor(),
              com.google.ads.googleads.v6.resources.OfflineUserDataJobProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_ads_googleads_v6_services_CreateOfflineUserDataJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v6_services_CreateOfflineUserDataJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_googleads_v6_services_CreateOfflineUserDataJobRequest_descriptor,
            new java.lang.String[] {
              "CustomerId", "Job",
            });
    internal_static_google_ads_googleads_v6_services_CreateOfflineUserDataJobResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v6_services_CreateOfflineUserDataJobResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_googleads_v6_services_CreateOfflineUserDataJobResponse_descriptor,
            new java.lang.String[] {
              "ResourceName",
            });
    internal_static_google_ads_googleads_v6_services_GetOfflineUserDataJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v6_services_GetOfflineUserDataJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_googleads_v6_services_GetOfflineUserDataJobRequest_descriptor,
            new java.lang.String[] {
              "ResourceName",
            });
    internal_static_google_ads_googleads_v6_services_RunOfflineUserDataJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v6_services_RunOfflineUserDataJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_googleads_v6_services_RunOfflineUserDataJobRequest_descriptor,
            new java.lang.String[] {
              "ResourceName",
            });
    internal_static_google_ads_googleads_v6_services_AddOfflineUserDataJobOperationsRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v6_services_AddOfflineUserDataJobOperationsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_googleads_v6_services_AddOfflineUserDataJobOperationsRequest_descriptor,
            new java.lang.String[] {
              "ResourceName", "EnablePartialFailure", "Operations", "EnablePartialFailure",
            });
    internal_static_google_ads_googleads_v6_services_OfflineUserDataJobOperation_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v6_services_OfflineUserDataJobOperation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_googleads_v6_services_OfflineUserDataJobOperation_descriptor,
            new java.lang.String[] {
              "Create", "Remove", "RemoveAll", "Operation",
            });
    internal_static_google_ads_googleads_v6_services_AddOfflineUserDataJobOperationsResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v6_services_AddOfflineUserDataJobOperationsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_googleads_v6_services_AddOfflineUserDataJobOperationsResponse_descriptor,
            new java.lang.String[] {
              "PartialFailureError",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.ads.googleads.v6.common.OfflineUserDataProto.getDescriptor();
    com.google.ads.googleads.v6.resources.OfflineUserDataJobProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
