INSERT INTO public.files(file_id, file_name)VALUES('bd48f399-6299-413e-a1a3-de7fdd2a3554', 'file1');
INSERT INTO public.files(file_id, file_name)VALUES('a9f2760e-60a6-49b9-93d7-e4848fbfe4dd', 'file2');


INSERT INTO public.line_statistics(line_id, file_id, line_number, line_length, longest_word, shortest_word, average_word_length)
VALUES('7a566213-50ea-4451-ac74-70cdd158d38d', 'bd48f399-6299-413e-a1a3-de7fdd2a3554', 2, 2, '2', '2', 2);
INSERT INTO public.line_statistics(line_id, file_id, line_number, line_length, longest_word, shortest_word, average_word_length)
VALUES('7a566213-50ea-4451-ac74-70cdd158da8d', 'bd48f399-6299-413e-a1a3-de7fdd2a3554', 1, 1, '1', '1', 1);
INSERT INTO public.line_statistics(line_id, file_id, line_number, line_length, longest_word, shortest_word, average_word_length)
VALUES('fffc410f-bd26-46ca-802f-45e95013b517', 'bd48f399-6299-413e-a1a3-de7fdd2a3554', 3, 3, '3', '3', 3);
INSERT INTO public.line_statistics(line_id, file_id, line_number, line_length, longest_word, shortest_word, average_word_length)
VALUES('aba2af47-b8eb-48c7-8976-84cbcf5c1764', 'a9f2760e-60a6-49b9-93d7-e4848fbfe4dd', 1, 1, '1', '1', 1);