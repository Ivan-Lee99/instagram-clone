
python -m grpc_tools.protoc -I. --python_out=app/codegen/ --grpc_python_out=app/codegen/ proto/user_service.proto
