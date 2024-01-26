
sort [] = []
sort xs = init $ concat $ writePair $isort (frequencySorter xs)


main = interact $ sort . tail . tail . map (\x -> read x :: Int) . words

count _ [] n     = n
count y (x:xs) n | y == x    = count y xs (n+1)
                 | otherwise = count y xs n

rmdup [] ys = []
rmdup (x:xs) ys | x `notElem ` ys = x : rmdup xs (x : ys)
                | otherwise       = rmdup xs ys

frequencySorter xs = rmdup [(a,b) | (a,b) <- zip xs cx] []
                        where 
                            cx = map (\y -> count y xs 0) xs

insert x []     = [x]
insert x (y:ys) | snd x >= snd y = x : y : ys
                | otherwise      = y : insert x ys

isort [] = []
isort xs = foldr insert [] xs

writePair [] = []
writePair xs = foldr (\x -> (++) (replicate (snd x) (show (fst x) ++ 
                   " "))) [] xs
                 