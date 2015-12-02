def textContent = new File('/path/to/file').text

def words = textContent.tokenize()
def wordFrequency = [:]
words.each { word->
    wordFrequency[word] = wordFrequency.get(word,0) + 1
} 

def wordList = wordFrequency.keySet().toList()
wordList.sort{ wordFrequency[it] }

def statistic = "\n"
wordList[-1..-5].each { word->
    statistic += word.padLeft(12) + ': '
    statistic += wordFrequency[word] + "\n"
}

println statistic

