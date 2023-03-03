# src.LazyInitializedSingleton

If I completed the assignment correctly it seems like that when the code is ran sometimes the has code will be different
from the rest when they should be all the same.

For example:
Thread-1 hash code: 2101625777
Thread-3 hash code: 666578995
Thread-2 hash code: 666578995
Thread-1 hash code: 2101625777
Thread-3 hash code: 2101625777
Thread-2 hash code: 2101625777

It started correctly but thread-3 and thread-2 produced a different hash before returning to the correct one.

Running it a few times more at least one Thread will have a different hash compared to the rest.