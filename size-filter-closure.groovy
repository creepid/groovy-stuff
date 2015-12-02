class SizeFilter {
    Integer limit
    
    def sizeUpTo(String value) {
        return value.size() <= limit
    }
}

SizeFilter filter6 = new SizeFilter(limit:6)
SizeFilter filter5 = new SizeFilter(limit:5)

Closure sizeUpTo6 = filter6.&sizeUpTo

def words = ['long string', 'medium', 'short', 'tiny']

assert 'medium' == words.find (sizeUpTo6)
assert 'short' == words.find (filter5.&sizeUpTo)