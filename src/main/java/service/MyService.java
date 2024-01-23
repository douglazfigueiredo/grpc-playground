@GRpcService
public class MyServiceImpl extends MyServiceGrpc.MyServiceImplBase {
    @Override
    public void myMethod(MyRequest request, StreamObserver<MyResponse> responseObserver) {
        // Implemente a lógica do seu serviço aqui
        String replyMessage = "Hello, " + request.getMessage();
        MyResponse response = MyResponse.newBuilder().setReply(replyMessage).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
