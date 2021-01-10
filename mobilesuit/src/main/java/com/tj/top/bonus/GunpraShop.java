package com.tj.top.bonus;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import com.tj.top.bonus.GunPra.Type;

public class GunpraShop {
	public static void main(String[] args) {
		List<GunPra> salesList = Arrays.asList(
				new GunPra("PG", "RX78-2", "퍼스트건담", true, 120000, Type.FEDERATION),
				new GunPra("PG", "RX178", "건담mk-2", true, 100000, Type.FEDERATION),
				new GunPra("PG", "MSN-04", "사자비", true, 300000, Type.ZEON),
				new GunPra("PG", "AMX-004", "큐베레이", false, 450000, Type.ZEON),
				new GunPra("MG", "MSN-03", "야크트도가", true, 80000, Type.ZEON),
				new GunPra("MG", "MA-03", "아프사라스II", false, 150000, Type.ZEON),
				new GunPra("MG", "RX-93v", "뉴건담", true, 450000, Type.FEDERATION),
				new GunPra("RG", "OZ-00M8", "톨기스", true, 30000, Type.OZ),
				new GunPra("RG", "MS-06F", "자쿠II", true, 15000, Type.FEDERATION),
				new GunPra("RG", "MSZ-010", "더블제타", false, 70000, Type.FEDERATION),
				new GunPra("RG", "MSZ-006", "제타건담", false, 50000, Type.FEDERATION)
				);
		
		List<String> price = getPrice5만원(salesList);
		System.out.println("5만원인거 기체명 : " +price);
		
		List<String> zeonType = getTypeList(salesList);
		System.out.println("지온타입 기체모델명 : " + zeonType);
		
		List<GunPra> wantList = fitering(salesList , (gundam) -> gundam.getScale().equals("PG") || gundam.getPrice() > 120000 || gundam.getType().equals(Type.OZ)) ;
		System.out.println(wantList);

	}

	public static List<String> getPrice5만원(List<GunPra> salesList) {
		return salesList.stream().filter(gundam -> gundam.getPrice() == 50000).map(GunPra::getName).collect(toList());
	}

	public static List<String> getTypeList(List<GunPra> salesList) {
		return salesList.stream().filter(gundam -> gundam.getType().equals(Type.ZEON)).map(GunPra::getModel).collect(toList());
	}

	public static List<GunPra> fitering(List<GunPra> salesList, Predicate<GunPra> p) {
		List<GunPra> result = new ArrayList<>();
		for (GunPra element : salesList) {
			if (p.test(element)) {
				result.add(element);
			}
		}
		return result;
	}

}
