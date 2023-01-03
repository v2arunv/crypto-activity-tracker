if [ $# -eq 0 ]
  then
	  echo "No arguments passed. Exiting"
	  exit 0
fi

PROTO_FILE=$1

#find . -maxdepth 1 -mindepth 1 -name "*${PROTO_FILE}*" -print -exec rm {} \;

python3 -m grpc_tools.protoc -I ../protobuf --python_out=./rpc --grpc_python_out=./rpc ../protobuf/${PROTO_FILE}.proto

