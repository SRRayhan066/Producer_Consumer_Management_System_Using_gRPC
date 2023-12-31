package com.example.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: user.proto")
public final class userGrpc {

  private userGrpc() {}

  public static final String SERVICE_NAME = "user";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.User.RegistrationRequest,
      com.example.grpc.User.APIResponse> getRegistrationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "registration",
      requestType = com.example.grpc.User.RegistrationRequest.class,
      responseType = com.example.grpc.User.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.User.RegistrationRequest,
      com.example.grpc.User.APIResponse> getRegistrationMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.User.RegistrationRequest, com.example.grpc.User.APIResponse> getRegistrationMethod;
    if ((getRegistrationMethod = userGrpc.getRegistrationMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getRegistrationMethod = userGrpc.getRegistrationMethod) == null) {
          userGrpc.getRegistrationMethod = getRegistrationMethod = 
              io.grpc.MethodDescriptor.<com.example.grpc.User.RegistrationRequest, com.example.grpc.User.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "registration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.User.RegistrationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.User.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("registration"))
                  .build();
          }
        }
     }
     return getRegistrationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.User.LoginRequest,
      com.example.grpc.User.APIResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = com.example.grpc.User.LoginRequest.class,
      responseType = com.example.grpc.User.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.User.LoginRequest,
      com.example.grpc.User.APIResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.User.LoginRequest, com.example.grpc.User.APIResponse> getLoginMethod;
    if ((getLoginMethod = userGrpc.getLoginMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getLoginMethod = userGrpc.getLoginMethod) == null) {
          userGrpc.getLoginMethod = getLoginMethod = 
              io.grpc.MethodDescriptor.<com.example.grpc.User.LoginRequest, com.example.grpc.User.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.User.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.User.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.User.CreateProfileRequest,
      com.example.grpc.User.APIResponse> getCreateProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createProfile",
      requestType = com.example.grpc.User.CreateProfileRequest.class,
      responseType = com.example.grpc.User.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.User.CreateProfileRequest,
      com.example.grpc.User.APIResponse> getCreateProfileMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.User.CreateProfileRequest, com.example.grpc.User.APIResponse> getCreateProfileMethod;
    if ((getCreateProfileMethod = userGrpc.getCreateProfileMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getCreateProfileMethod = userGrpc.getCreateProfileMethod) == null) {
          userGrpc.getCreateProfileMethod = getCreateProfileMethod = 
              io.grpc.MethodDescriptor.<com.example.grpc.User.CreateProfileRequest, com.example.grpc.User.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "createProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.User.CreateProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.User.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("createProfile"))
                  .build();
          }
        }
     }
     return getCreateProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.User.ShowUserProfileRequest,
      com.example.grpc.User.ShowUserProfileRequestResponse> getShowProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "showProfile",
      requestType = com.example.grpc.User.ShowUserProfileRequest.class,
      responseType = com.example.grpc.User.ShowUserProfileRequestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.User.ShowUserProfileRequest,
      com.example.grpc.User.ShowUserProfileRequestResponse> getShowProfileMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.User.ShowUserProfileRequest, com.example.grpc.User.ShowUserProfileRequestResponse> getShowProfileMethod;
    if ((getShowProfileMethod = userGrpc.getShowProfileMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getShowProfileMethod = userGrpc.getShowProfileMethod) == null) {
          userGrpc.getShowProfileMethod = getShowProfileMethod = 
              io.grpc.MethodDescriptor.<com.example.grpc.User.ShowUserProfileRequest, com.example.grpc.User.ShowUserProfileRequestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "showProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.User.ShowUserProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.User.ShowUserProfileRequestResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("showProfile"))
                  .build();
          }
        }
     }
     return getShowProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.User.UpdateProfileRequest,
      com.example.grpc.User.APIResponse> getUpdateProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateProfile",
      requestType = com.example.grpc.User.UpdateProfileRequest.class,
      responseType = com.example.grpc.User.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.User.UpdateProfileRequest,
      com.example.grpc.User.APIResponse> getUpdateProfileMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.User.UpdateProfileRequest, com.example.grpc.User.APIResponse> getUpdateProfileMethod;
    if ((getUpdateProfileMethod = userGrpc.getUpdateProfileMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getUpdateProfileMethod = userGrpc.getUpdateProfileMethod) == null) {
          userGrpc.getUpdateProfileMethod = getUpdateProfileMethod = 
              io.grpc.MethodDescriptor.<com.example.grpc.User.UpdateProfileRequest, com.example.grpc.User.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "updateProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.User.UpdateProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.User.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("updateProfile"))
                  .build();
          }
        }
     }
     return getUpdateProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.User.Empty,
      com.example.grpc.User.APIResponse> getLogoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "logout",
      requestType = com.example.grpc.User.Empty.class,
      responseType = com.example.grpc.User.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.User.Empty,
      com.example.grpc.User.APIResponse> getLogoutMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.User.Empty, com.example.grpc.User.APIResponse> getLogoutMethod;
    if ((getLogoutMethod = userGrpc.getLogoutMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getLogoutMethod = userGrpc.getLogoutMethod) == null) {
          userGrpc.getLogoutMethod = getLogoutMethod = 
              io.grpc.MethodDescriptor.<com.example.grpc.User.Empty, com.example.grpc.User.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "logout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.User.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.User.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("logout"))
                  .build();
          }
        }
     }
     return getLogoutMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static userStub newStub(io.grpc.Channel channel) {
    return new userStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static userBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new userBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static userFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new userFutureStub(channel);
  }

  /**
   */
  public static abstract class userImplBase implements io.grpc.BindableService {

    /**
     */
    public void registration(com.example.grpc.User.RegistrationRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.User.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRegistrationMethod(), responseObserver);
    }

    /**
     */
    public void login(com.example.grpc.User.LoginRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.User.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    public void createProfile(com.example.grpc.User.CreateProfileRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.User.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateProfileMethod(), responseObserver);
    }

    /**
     */
    public void showProfile(com.example.grpc.User.ShowUserProfileRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.User.ShowUserProfileRequestResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getShowProfileMethod(), responseObserver);
    }

    /**
     */
    public void updateProfile(com.example.grpc.User.UpdateProfileRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.User.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateProfileMethod(), responseObserver);
    }

    /**
     */
    public void logout(com.example.grpc.User.Empty request,
        io.grpc.stub.StreamObserver<com.example.grpc.User.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLogoutMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegistrationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.User.RegistrationRequest,
                com.example.grpc.User.APIResponse>(
                  this, METHODID_REGISTRATION)))
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.User.LoginRequest,
                com.example.grpc.User.APIResponse>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getCreateProfileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.User.CreateProfileRequest,
                com.example.grpc.User.APIResponse>(
                  this, METHODID_CREATE_PROFILE)))
          .addMethod(
            getShowProfileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.User.ShowUserProfileRequest,
                com.example.grpc.User.ShowUserProfileRequestResponse>(
                  this, METHODID_SHOW_PROFILE)))
          .addMethod(
            getUpdateProfileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.User.UpdateProfileRequest,
                com.example.grpc.User.APIResponse>(
                  this, METHODID_UPDATE_PROFILE)))
          .addMethod(
            getLogoutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.User.Empty,
                com.example.grpc.User.APIResponse>(
                  this, METHODID_LOGOUT)))
          .build();
    }
  }

  /**
   */
  public static final class userStub extends io.grpc.stub.AbstractStub<userStub> {
    private userStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userStub(channel, callOptions);
    }

    /**
     */
    public void registration(com.example.grpc.User.RegistrationRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.User.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegistrationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void login(com.example.grpc.User.LoginRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.User.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createProfile(com.example.grpc.User.CreateProfileRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.User.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void showProfile(com.example.grpc.User.ShowUserProfileRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.User.ShowUserProfileRequestResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getShowProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateProfile(com.example.grpc.User.UpdateProfileRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.User.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logout(com.example.grpc.User.Empty request,
        io.grpc.stub.StreamObserver<com.example.grpc.User.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class userBlockingStub extends io.grpc.stub.AbstractStub<userBlockingStub> {
    private userBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.User.APIResponse registration(com.example.grpc.User.RegistrationRequest request) {
      return blockingUnaryCall(
          getChannel(), getRegistrationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.User.APIResponse login(com.example.grpc.User.LoginRequest request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.User.APIResponse createProfile(com.example.grpc.User.CreateProfileRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateProfileMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.User.ShowUserProfileRequestResponse showProfile(com.example.grpc.User.ShowUserProfileRequest request) {
      return blockingUnaryCall(
          getChannel(), getShowProfileMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.User.APIResponse updateProfile(com.example.grpc.User.UpdateProfileRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateProfileMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.User.APIResponse logout(com.example.grpc.User.Empty request) {
      return blockingUnaryCall(
          getChannel(), getLogoutMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class userFutureStub extends io.grpc.stub.AbstractStub<userFutureStub> {
    private userFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.User.APIResponse> registration(
        com.example.grpc.User.RegistrationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRegistrationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.User.APIResponse> login(
        com.example.grpc.User.LoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.User.APIResponse> createProfile(
        com.example.grpc.User.CreateProfileRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateProfileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.User.ShowUserProfileRequestResponse> showProfile(
        com.example.grpc.User.ShowUserProfileRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getShowProfileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.User.APIResponse> updateProfile(
        com.example.grpc.User.UpdateProfileRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateProfileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.User.APIResponse> logout(
        com.example.grpc.User.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTRATION = 0;
  private static final int METHODID_LOGIN = 1;
  private static final int METHODID_CREATE_PROFILE = 2;
  private static final int METHODID_SHOW_PROFILE = 3;
  private static final int METHODID_UPDATE_PROFILE = 4;
  private static final int METHODID_LOGOUT = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final userImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(userImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTRATION:
          serviceImpl.registration((com.example.grpc.User.RegistrationRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.User.APIResponse>) responseObserver);
          break;
        case METHODID_LOGIN:
          serviceImpl.login((com.example.grpc.User.LoginRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.User.APIResponse>) responseObserver);
          break;
        case METHODID_CREATE_PROFILE:
          serviceImpl.createProfile((com.example.grpc.User.CreateProfileRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.User.APIResponse>) responseObserver);
          break;
        case METHODID_SHOW_PROFILE:
          serviceImpl.showProfile((com.example.grpc.User.ShowUserProfileRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.User.ShowUserProfileRequestResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PROFILE:
          serviceImpl.updateProfile((com.example.grpc.User.UpdateProfileRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.User.APIResponse>) responseObserver);
          break;
        case METHODID_LOGOUT:
          serviceImpl.logout((com.example.grpc.User.Empty) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.User.APIResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class userBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    userBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.User.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("user");
    }
  }

  private static final class userFileDescriptorSupplier
      extends userBaseDescriptorSupplier {
    userFileDescriptorSupplier() {}
  }

  private static final class userMethodDescriptorSupplier
      extends userBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    userMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (userGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new userFileDescriptorSupplier())
              .addMethod(getRegistrationMethod())
              .addMethod(getLoginMethod())
              .addMethod(getCreateProfileMethod())
              .addMethod(getShowProfileMethod())
              .addMethod(getUpdateProfileMethod())
              .addMethod(getLogoutMethod())
              .build();
        }
      }
    }
    return result;
  }
}
