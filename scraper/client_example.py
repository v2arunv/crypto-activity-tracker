import grpc

from rpc import TokenInfoServiceStub
from rpc import Blockchain, GetTokenInfoRequest, GetTokenInfoResponse

channel = grpc.insecure_channel("localhost:50051")
client = TokenInfoServiceStub(channel)

request = GetTokenInfoRequest(blockchain=Blockchain.ETHEREUM, token_symbol="AAVE")

result = client.GetTokenInfo(request)

print(result)
