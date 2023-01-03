from concurrent import futures
from rpc.token_pb2_grpc import add_TokenInfoServiceServicer_to_server
from token_service import TokenService
import grpc


def serve():
    server = grpc.server(futures.ThreadPoolExecutor(max_workers=10))
    add_TokenInfoServiceServicer_to_server(TokenService(), server)
    server.add_insecure_port('[::]:50051')
    server.start()
    server.wait_for_termination()

if __name__ == '__main__':
    serve()

