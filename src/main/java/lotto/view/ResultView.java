package lotto.view;

import lotto.model.Lotto;
import lotto.model.LottoNumber;
import lotto.model.LottoNumbers;
import lotto.model.Rank;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;
import java.util.stream.Collectors;

public class ResultView {
    private static final String LOTTO_RANK_RESULT_FORMAT = "%s개 일치 (%s원)- %s개";
    private static final List<Rank> PRINTABLE_RANKS = Arrays.asList(
            Rank.FIRST,
            Rank.SECOND,
            Rank.THIRD,
            Rank.FOURTH
    );

    public void printBoughtResult(List<Lotto> lottoList) {
        StringBuilder result = new StringBuilder();
        result.append(lottoList.size())
                .append("개를 구매했습니다.");
        System.out.println(result);
        lottoList.forEach((Lotto lotto ) -> printLottoNumbers(lotto.getLottoNumbers()));
    }

    public void printLottoNumbers(LottoNumbers numbers) {
        System.out.println(parseLottoNumbers(numbers));
    }

    List<Integer> parseLottoNumbers(final LottoNumbers lottoNumbers) {
        return lottoNumbers.getLottoNumbers().stream()
                .map(LottoNumber::getLottoNumber)
                .collect(Collectors.toList());
    }

    public void printLottoResults(EnumMap<Rank, Integer> lottoRankings) {
        System.out.println("당첨 통계\n----------");
        PRINTABLE_RANKS.forEach((Rank rank) -> {
            Integer counts = lottoRankings.getOrDefault(rank, 0);
            System.out.println(String.format(LOTTO_RANK_RESULT_FORMAT, rank.getCount(), rank.getReward(), counts));
        });
    }
}
