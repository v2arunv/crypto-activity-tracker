from rpc.token_pb2 import TokenInfo, GetTokenInfoRequest, GetTokenInfoResponse
from rpc.token_pb2_grpc import TokenInfoServiceServicer

class TokenService(
    TokenInfoServiceServicer
):
    def GetTokenInfo(self, request, context):
        return GetTokenInfoResponse(
            token_info=TokenInfo(
                name="Test Token",
                symbol="TT",
                decimal_size=18,
            )
        )        

