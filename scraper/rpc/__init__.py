# Must have code in order to make sure that the generate *_grpc.py 
# code can access the generated *_pb2.py code. This does unfortunately
# mean that we're injecting another path into the global set of import paths,
# but it's the only way I've found to make this work.
import sys, os
sys.path.append(os.path.dirname(__file__))

# Regular exports here for the rest of the codebase to use.
from .token_pb2 import *
from .token_pb2_grpc import *
